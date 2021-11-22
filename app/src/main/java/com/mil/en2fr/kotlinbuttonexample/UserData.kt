package com.mil.en2fr.kotlinbuttonexample

data class UserData (val month:String, val user:List<User>){
    data class User(
            val picture:String,
            val name:String,
            val profession:String
    )

}