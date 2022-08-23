package com.tunahan.kotlinoop

//primary constructor
//open class to get inheritance
open class Animal(var age: Int?, var name: String?) : Hello() {

  /*
    var age:Int? = null
        //public getter
        get
        //private setter
        private set
    var name: String = null
        private get
        set

    constructor(age: Int?, name: String?) {
        this.age = age
        this.name = name
    }
     */

    init {
        //first called function
        println("first called function")
    }
}