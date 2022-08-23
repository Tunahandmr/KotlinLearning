package com.tunahan.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello kotlin")
        //Variable
        var x=5
        var y = "variable"
        //Constants
        val a = 25
        val b = "constant"

        var myInteger : Int =25
        var myFloat : Float = 12.35f
        val pi : Double = 3.14

        val name :String = "tunahan"
        var myBoolean:Boolean = true

        //Conversion

        var myNumber = 5
        var myLong = myNumber.toLong()

        var input = "10"
        var inputInteger = input.toInt()

        //Arrays
        val myArray = arrayOf("hasan","ahmet","burak")
        println(myArray[0])
        myArray.set(1,"mehmet")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        val numberNewArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0)
        val mixedArray = arrayOf("tunahan",5)
        println(mixedArray[0])
        println(mixedArray[1])

        //ArrayList
        val myAnimal = arrayListOf<String>("dog","cat")
        myAnimal.add("deer")
        println(myAnimal[2])
        myAnimal.add(0,"crow")
        println(myAnimal[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(12)
        myArrayList.add(150)

        val mixedArrayList = ArrayList<Any>()
        mixedArrayList.add("tunahan")
        mixedArrayList.add(12)
        mixedArrayList.add(15.68)

        //Set
        val myExampleArray = arrayOf(1,1,2,4,5)
        println("index 1: ${myExampleArray[0]}")
        println("index 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)
        //For Each
        mySet.forEach { println(it) }

        val myStringSet = HashSet<String>()
        myStringSet.add("tunahan")
        myStringSet.add("tunahan")
        println(myStringSet.size)

        //HashMap
        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("apple",100)
        fruitCalorieMap.put("banana",300)
        println(fruitCalorieMap["apple"])

        val myHashMap = HashMap<String,Int>()

        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
        println(myHashMap["A"])

        //Switch - When
        val day=3
        var dayString = ""

        when(day){
            1->dayString="monday"
            2->dayString="tuesday"
            3->dayString="wednesday"
            else-> dayString = ""
    }
        println(dayString)

        //For Loop
        val myArrayOfNumber = arrayOf(1,2,3,4,5,6)
        for (number in myArrayOfNumber){
            val z = number
            println(z)
        }

        for(i in myArrayOfNumber.indices){
            val qz = myArrayOfNumber[i]
            println(qz)
        }

        myArrayOfNumber.forEach { println(it) }

        for (b in 0..9){
            println(b)
        }

}}