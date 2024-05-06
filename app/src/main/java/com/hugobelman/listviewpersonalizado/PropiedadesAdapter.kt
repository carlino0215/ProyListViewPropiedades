package com.hugobelman.listviewpersonalizado

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_propiedad.view.*

class PropiedadesAdapter(private val mContext: Context, private val listaPropiedad: List<Propiedad>) : ArrayAdapter<Propiedad>(mContext, 0, listaPropiedad) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_propiedad, parent, false)

        val propiedad = listaPropiedad[position]

        layout.nombre.text = propiedad.nombre
        layout.precio.text = "$${propiedad.precio}"
        layout.imageView.setImageResource(propiedad.imagen)

        return layout
    }

}