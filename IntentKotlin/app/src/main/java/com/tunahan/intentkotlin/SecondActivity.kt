package com.tunahan.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tunahan.intentkotlin.databinding.ActivityMainBinding
import com.tunahan.intentkotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var intent = intent
        val name= intent.getStringExtra("name")
        if (name != ""){
            binding.nameTextView.text = "Name: $name"
        }

    }

    fun secondButton(view: View){

        var intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()


    }
}