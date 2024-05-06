package com.hugobelman.listviewpersonalizado

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val propiedad = Propiedad("Venta", 100000000.0, "Calle Santigo #987", R.drawable.image10)
        val propiedad2 = Propiedad("Arriendo", 400000.0, "Villa Bolivar A #123", R.drawable.image2)
        val propiedad3 = Propiedad("Venta", 300000.0, "Calle Antofagasta #456", R.drawable.image3)
        val propiedad4 = Propiedad("Arriendo", 300000.0, "Calle Calama #568", R.drawable.image4)
        val propiedad5 = Propiedad("Arriendo", 300000.0, "Calle Arica #956", R.drawable.image5)
        val propiedad6 = Propiedad("Arriendo", 300000.0, "Calle Maipu #456", R.drawable.image6)
        val propiedad7 = Propiedad("Venta", 300000.0, "Calle Iquique #503", R.drawable.image7)
        val propiedad8 = Propiedad("Arriendo", 300000.0, "Calle Calama #4888", R.drawable.image8)
        val propiedad9 = Propiedad("Venta", 300000.0, "Calle La Paz #9684", R.drawable.image9)

        val listaPropiedades = listOf(propiedad, propiedad2, propiedad3, propiedad4,  propiedad5,
                                                    propiedad6, propiedad7, propiedad8, propiedad9)

        val adapter = PropiedadesAdapter(this, listaPropiedades)

        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, PropiedadActivity::class.java)
            intent.putExtra("propiedad", listaPropiedades[position])
            startActivity(intent)
        }
    }
}
