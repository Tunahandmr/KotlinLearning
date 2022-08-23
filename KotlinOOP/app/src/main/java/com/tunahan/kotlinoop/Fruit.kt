package com.tunahan.kotlinoop

class Fruit : Banana,Kiwi {

    var name : String? = null
    var price : Int? = null

    override var color: String
        get() = "yellow"
        set(value) {}
}