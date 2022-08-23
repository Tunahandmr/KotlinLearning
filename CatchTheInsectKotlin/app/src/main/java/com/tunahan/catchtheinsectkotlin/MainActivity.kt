package com.tunahan.catchtheinsectkotlin

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.tunahan.catchtheinsectkotlin.databinding.ActivityMainBinding
import java.util.ArrayList


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    var score =0
    var scorePreferences  = 0
    lateinit var sharedPreferences: SharedPreferences

    var pics = ArrayList<ImageView>()
    //var pics: Array<ImageView?> = arrayOfNulls(9)
    //val pics = arrayOfNulls<ImageView?>(6)
    lateinit var runnable: Runnable
    var handler = Handler()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        pics.add(binding.imageView)
        pics.add(binding.imageView2)
        pics.add(binding.imageView3)
        pics.add(binding.imageView4)
        pics.add(binding.imageView5)
        pics.add(binding.imageView6)
        pics.add(binding.imageView7)
        pics.add(binding.imageView8)
        pics.add(binding.imageView9)



        for(i in pics){

            i.visibility = View.INVISIBLE

        }


        binding.restartButton.visibility = View.GONE

        sharedPreferences = this.getSharedPreferences("com.tunahan.catchtheinsectkotlin",Context.MODE_PRIVATE)
        scorePreferences = sharedPreferences.getInt("score",0)


        if (scorePreferences==0){
            binding.highScoreText.text = "High Score: 0"
        }else{
            binding.highScoreText.text = "High Score: $scorePreferences"

        }


    }

    fun startButton(view: View){

        runnable = object :Runnable{
            override fun run() {

                for(i in pics){

                        i.visibility = View.INVISIBLE

                }

                /*
                val random = Random()
                val rndm = random.nextInt(9)
                 */

                val random = (0..8).random()
                pics[random].visibility = View.VISIBLE
                handler.postDelayed(runnable,500)


            }

        }
        handler.post(runnable)
        binding.startButton.visibility = View.INVISIBLE

        object : CountDownTimer(15000,1000) {
            override fun onTick(p0: Long) {
                binding.timeText.text = "Time: ${p0/1000}"

            }

            override fun onFinish() {
                binding.timeText.text = "Time of over!!"
                handler.removeCallbacks(runnable)
                for(i in pics){

                        i.visibility = View.INVISIBLE

                }


                if (score>scorePreferences){
                    sharedPreferences.edit().putInt("score",score).apply()

                }

                val alert = AlertDialog.Builder(this@MainActivity)
                alert.setTitle("Restart")
                alert.setMessage("do you want to start over")

                alert.setPositiveButton("Yes"){dialog,which->

                    val intent = intent
                    finish()
                    startActivity(intent)

                }

                alert.setNegativeButton("No"){dialog,which->
                    Toast.makeText(applicationContext,"click the a button to start over",Toast.LENGTH_LONG).show()
                    binding.restartButton.visibility = View.VISIBLE
                }

                alert.show()



            }

        }.start()


    }

    fun restartButton(view: View){

        val intent = intent
        finish()
        startActivity(intent)


    }

    fun clickInsect(view: View){
        score++
        binding.scoreText.text = "Score: $score"

    }
}