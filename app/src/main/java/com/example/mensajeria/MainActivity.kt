package com.example.mensajeria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.mensajeria.adapter.ItemAdapter
import com.example.mensajeria.datasource.ListMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variable de el recycler view
        val reciclador :RecyclerView =findViewById(R.id.recycler_mensajes)
        //una variable con la lista de mensajes
        val listamensajes = ListMessage.listaMensages
        //asociar al reciclerview el reciclerview.adapter con la lista, medinate adapter
        reciclador.adapter=ItemAdapter(listamensajes)
    }
}