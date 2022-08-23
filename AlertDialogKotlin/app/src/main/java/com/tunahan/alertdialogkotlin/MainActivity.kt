package com.tunahan.alertdialogkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.tunahan.alertdialogkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Java-MainActivity.this , Kotlin-this@MainActivity

        /*

        binding.alertButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                alertButton(view)
            }
        })

         */


    }

    fun alertButton(view: View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Alert")
        alert.setMessage("Yes or No")

        //dialog,which -> can be replaced with anything. for example d,w
        alert.setPositiveButton("Yes"){dialog,which->
            Toast.makeText(applicationContext,"Yes Clicked",Toast.LENGTH_LONG).show()
        }

        alert.setNegativeButton("No"){dialog,which->
            Toast.makeText(applicationContext,"No Clicked",Toast.LENGTH_LONG).show()
        }

        alert.show()
    }
}