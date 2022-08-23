package com.tunahan.simplecalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tunahan.simplecalculatorkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //initialize afterwards
    lateinit var myString: String

    var number1: Int? = null
    var number2: Int? = null
    var numberResult: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //!! -> I am sure
    }

    fun addition(view: View){
        number1 = binding.numberOneText.text.toString().toIntOrNull()
        number2 = binding.numberTwoText.text.toString().toIntOrNull()
        if (number1==null || number2==null){
            binding.resultText.text="Error!!!"

        }else{
            numberResult = number1!!+number2!!
            binding.resultText.text="Result: ${numberResult}"
        }

    }

    fun subtraction(view: View){
        number1 = binding.numberOneText.text.toString().toIntOrNull()
        number2 = binding.numberTwoText.text.toString().toIntOrNull()
        if (number1==null || number2==null){
            binding.resultText.text="Error!!!"

        }else{
            numberResult = number1!!-number2!!
            binding.resultText.text="Result: ${numberResult}"
        }

    }

    fun multiplication(view: View){
        number1 = binding.numberOneText.text.toString().toIntOrNull()
        number2 = binding.numberTwoText.text.toString().toIntOrNull()
        if (number1==null || number2==null){
            binding.resultText.text="Error!!!"

        }else{
            numberResult = number1!!*number2!!
            binding.resultText.text="Result: ${numberResult}"
        }

    }

    fun division(view: View){
        number1 = binding.numberOneText.text.toString().toIntOrNull()
        number2 = binding.numberTwoText.text.toString().toIntOrNull()
        if (number1==null || number2==null){
            binding.resultText.text="Error!!!"

        }else if (number2==0){
            binding.resultText.text="Result: undefined"
        }else{
            numberResult = number1!!/number2!!
            binding.resultText.text="Result: ${numberResult}"
        }

    }


}