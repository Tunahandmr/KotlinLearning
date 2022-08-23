package com.tunahan.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tunahan.intentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




    }

    fun firstButton(view: View){

        var intent = Intent(applicationContext,SecondActivity::class.java)
        intent.putExtra("name",binding.nameText.text.toString())
        startActivity(intent)
        finish()


    }
}