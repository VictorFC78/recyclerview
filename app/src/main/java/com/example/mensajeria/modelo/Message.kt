package com.example.mensajeria.modelo

import androidx.annotation.DrawableRes

data class Message(val authorName:String, @DrawableRes val imgAuthor:Int, val text:String) {
}
//@DrawableRes hace referencia al recurso de imagenes mediente un valor entero