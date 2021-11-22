package com.mil.en2fr.kotlinbuttonexample

class DataModel(name:String,isSection:Boolean,month:String) {
     var name : String?=null
    var issection : Boolean = false
    var month : String? =null
    init {
        this.name=name
        this.issection=isSection
        this.month=month
    }

}