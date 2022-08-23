package com.tunahan.kotlinoop

class Porsche : Car() {

    fun carVolume(){
        //car volume reference
        super.volume()
    }

    //overwrite -> override fun
    override fun volume(){
        println("porsche volume")
    }
}