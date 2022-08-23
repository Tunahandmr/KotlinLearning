package com.tunahan.storingdata

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tunahan.storingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    var agePreferences : Int? = null
    private var myAge:Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        sharedPreferences = this.getSharedPreferences("com.tunahan.storingdata", Context.MODE_PRIVATE)
         agePreferences = sharedPreferences.getInt("age",0)
        if (agePreferences==0){
            binding.textView.text= "Your Age:"
            binding.deleteButton.visibility = View.INVISIBLE
        }else{
            binding.textView.text= "Your Age: $agePreferences"
            binding.deleteButton.visibility = View.VISIBLE
        }
    }

    fun saveButton(view: View){
        binding.deleteButton.visibility = View.VISIBLE

        myAge=binding.numberText.text.toString().toInt()
        binding.textView.text = "Your Age: $myAge"
        sharedPreferences.edit().putInt("age",myAge).apply()
    }

    fun deleteButton(view: View){
        binding.deleteButton.visibility = View.INVISIBLE

        sharedPreferences.edit().remove("age").apply()
        binding.textView.text = "Your Age:"
    }
}