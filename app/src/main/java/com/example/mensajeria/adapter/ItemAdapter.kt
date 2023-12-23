package com.example.mensajeria.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.mensajeria.R
import com.example.mensajeria.modelo.Message
import com.google.android.material.imageview.ShapeableImageView
/*esta clase se encarga de vincular los elementos de la lista con el inflado a traves del holder,
el holder compone la vista y el adapter le pasa los datos que tiene que tener en cada momento
 */
class ItemAdapter(val listaMensages:List<Message>):RecyclerView.Adapter<ItemAdapter.ItemAdapterHolder>() {


class ItemAdapterHolder(view: View): RecyclerView.ViewHolder(view){
    /*
    referencias a los componentes de la vista mensaje_layout.xml que tiene conexion con los atributos
    de un Message
     */
    val imagen:ShapeableImageView =view.findViewById(R.id.imagen)//referencia al componente imagen del mensaje_layout
    val nombre:TextView=view.findViewById(R.id.nombre)//hace referenacia al txtview del nombre
    val comentario:TextView=view.findViewById(R.id.comentario)//hace referencia al txtview  del comentario

    fun vincular(item:Message){
        imagen.setImageResource(item.imgAuthor)//le establece la imagen al ShapeImageVies la foto del item que recibe donBindViewHolder
        nombre.text = item.authorName//le establece la texto al textview del item que recibe donBindViewHolder
        comentario.text = item.text//le establece la texto al textview del item que recibe donBindViewHolder
    }
}
    /*
    se encarga de inflar la vista de mensaje_layout pero sin nada dentro, para ello nececita el contexto,es decir de donde viene la imagen,
    para crear la imagen, utiliza un LayoutInlater e un inflator que el que genera la vista que se ve,retornando
    esta vista en un viewholder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapterHolder {
        val inflador= LayoutInflater.from(parent.context)
        val vistaInflada : View = inflador.inflate(R.layout.mensaje_layout, parent, false)
        return ItemAdapterHolder(vistaInflada)//vista de mensaje_layout inflada
    }

    override fun getItemCount(): Int {
        return listaMensages.size
    }
    //lo utiliza el viewholder para crear la vista de cada item
    override fun onBindViewHolder(holder: ItemAdapterHolder, position: Int) {
        holder.vincular(listaMensages[position])
    }

}