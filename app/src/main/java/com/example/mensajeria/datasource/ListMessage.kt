package com.example.mensajeria.datasource

import android.os.Build.VERSION_CODES.R
import com.example.mensajeria.R
import com.example.mensajeria.modelo.Message

class ListMessage() {
    companion object{//companion object es como las variables static en java
        val listaMensages= listOf<Message>(
            Message("Ana", R.drawable.img1,"¡Hola a todos!¿Cómo estáis hoy? "),
            Message("Carlos", R.drawable.img2,"Hola Ana, estoy un poco cansado, pero bien. ¿Y tú?"),
            Message("Juan", R.drawable.img3,"Yo pienso ir al cine, hay una pelicula que quiero ver"),
            Message("Luis", R.drawable.img4,"¡Vamos todos juntos!¿Que les parece el sábado por la tarde?"),
            Message("Sofía", R.drawable.img5,"Me encantaría pero tengo un compromiso. ¿Que tal el domingo?"),
            Message("Ana", R.drawable.img1,"¡El domingo me viene mejor también,poderiamos ir tomar un café despues"),
            Message("Manuel", R.drawable.img6,"Yo tengo el finde completo"),
            Message("Paula", R.drawable.img7,"Me apunto"),
            Message("Sergio", R.drawable.img8,"¿Que pelicula quereis ver?"),
            Message("Carlos", R.drawable.img2,"Si no es una peli cursi me apunto"),
            Message("Eva", R.drawable.img9,"Yo tengo turno de noche"),
            Message("David", R.drawable.img10,"No se si podre hasta el viernes de tarde")
        )
    }
}