package com.tunahan.runnablekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.tunahan.runnablekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number =0
    lateinit var runnable: Runnable
    var handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.stopButton.visibility = View.INVISIBLE
        binding.resetButton.visibility = View.INVISIBLE
        binding.continueButton.visibility = View.INVISIBLE
        binding.greenCircle.visibility = View.INVISIBLE

    }

    fun startButton(view: View){
        number=0
        binding.startButton.visibility= View.INVISIBLE
        binding.stopButton.visibility=View.VISIBLE
        binding.resetButton.visibility = View.VISIBLE
        binding.redCircle.visibility = View.INVISIBLE
        binding.greenCircle.visibility = View.VISIBLE

        runnable = object : Runnable{
            override fun run() {
                number+=1
                binding.timeText.text= "Time: $number"
                handler.postDelayed(this,1000)
            }

        }
        handler.post(runnable)

    }

    fun stopButton(view: View){
        binding.stopButton.visibility= View.INVISIBLE
        binding.resetButton.visibility = View.VISIBLE
        binding.continueButton.visibility = View.VISIBLE
        binding.redCircle.visibility = View.VISIBLE
        binding.greenCircle.visibility = View.INVISIBLE
        handler.removeCallbacks(runnable)
        binding.timeText.text= "Time: $number"


    }

    fun continueButton(view: View){
        binding.continueButton.visibility= View.INVISIBLE
        binding.stopButton.visibility = View.VISIBLE
        binding.resetButton.visibility = View.VISIBLE
        binding.redCircle.visibility = View.INVISIBLE
        binding.greenCircle.visibility = View.VISIBLE

        runnable = object : Runnable{
            override fun run() {
                number+=1
                binding.timeText.text= "Time: $number"
                handler.postDelayed(this,1000)
            }

        }
        handler.post(runnable)

    }

    fun resetButton(view: View){
        binding.resetButton.visibility= View.INVISIBLE
        binding.startButton.visibility = View.VISIBLE
        binding.continueButton.visibility = View.INVISIBLE
        binding.stopButton.visibility = View.INVISIBLE
        binding.redCircle.visibility = View.VISIBLE
        binding.greenCircle.visibility = View.INVISIBLE

        number=0
        handler.removeCallbacks(runnable)
        binding.timeText.text= "Time: $number"


    }
}