package com.hugobelman.listviewpersonalizado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_propiedad.*
import kotlinx.android.synthetic.main.activity_propiedad.detalles_propiedad
import kotlinx.android.synthetic.main.activity_propiedad.imagen
import kotlinx.android.synthetic.main.activity_propiedad.nombre_propiedad
import kotlinx.android.synthetic.main.activity_propiedad.precio_propiedad

class PropiedadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_propiedad)

        val propiedad = intent.getSerializableExtra("propiedad") as Propiedad

        nombre_propiedad.text = propiedad.nombre
        precio_propiedad.text = "$${propiedad.precio}"
        detalles_propiedad.text = propiedad.descripcion
        imagen.setImageResource(propiedad.imagen)

    }
}
