package com.tunahan.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tunahan.classesandfunctions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        test()
        mySum(10,23)
        //void-unit
        val result = myMultiply(12,13)

        //Object
        val hasan = People(25,"hasan","engineer")
      /*  hasan.age = 25
        hasan.job = "engineer"
        hasan.name = "hasan"
      */

        //Nullable -> ? , non-null
        //!! , ?
        var myString: String?= null
        var myAge:Int? = null

        //1)null safety
        if (myAge!=null){

            println(myAge*10)
        }else{
            println("null age")
        }

        //2)safe call
        println(myAge?.compareTo(2))

        //3)elvis
        // if value is null then it is equal to hundred
        val myResult = myAge?.compareTo(2) ?: 100
        println(myResult)

    }

    fun buttonMake(view: View){
        val name = binding.editTextName.text.toString()
        var age = binding.editTextAge.text.toString().toIntOrNull()
        val job = binding.editTextJob.text.toString()
        if (age == null){
            age =0
        }

        val x = People(age,name,job)

        binding.resultText.text="Name: ${x.name}, Age: ${x.age}, Job: ${x.job}"


    }

    fun test(){

        println("test function")

    }

    fun mySum(a:Int,b:Int){
        println(a+b)

    }

    fun myMultiply(c:Int,d:Int):Int{
        return c*d
    }



}