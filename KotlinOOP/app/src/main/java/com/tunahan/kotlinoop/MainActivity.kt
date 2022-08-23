package com.tunahan.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animal = Animal(21,"dog")
       // animal.age =  21
        //animal.name = "dog"

        println(animal.age)
        println(animal.name)
        //abstract class
        println(animal.hello())

        //inheritance

        var sAnimal = SuperAnimal(12,"cat")
        println(sAnimal.name)
        println(sAnimal.age)
        sAnimal.sign()

        //static polymorphism
        var mat = Math()
        println(mat.sum())
        println(mat.sum(1,2))
        println(mat.sum(1,2,3))

        //dynamic polymorphism
        var car = Car()

        var pors = Porsche()
        pors.carVolume()
        pors.volume()

        //abstract , interface
        var frt = Fruit()
        frt.name = "apple"
        frt.price = 20
        println(frt.color)
        frt.info()

        //lambda expressions

        fun myString(string: String){
            println(string)
        }

        myString("print string")

        val testString = {myStr: String -> println(myStr)}
        testString("lambda string")

        val multiplyLambda = {a:Int , b:Int ->a*b}
        println(multiplyLambda(4,6))

        val multiplyLambda2 : (Int,Int)->Int = {a,b -> a*b}
        println(multiplyLambda2(6,7))

        //asynchronous

        fun downloadAnimal (url: String,completion:(Animal)->Unit ){
            //url -> download
            //data
            val anml = Animal(12,"orange")
            completion(anml)
        }

        downloadAnimal("animal.com",{animal->
            println(animal.name)
        })


    }
}