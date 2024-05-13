package com.example.proyectomayo.ui.splash.presenter

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivitySplashBinding
import com.example.proyectomayo.ui.home.presenter.ActivityHome


class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showScreen()
    }

    private fun showScreen(){
        object : CountDownTimer(3000,1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                val intent = Intent(applicationContext, ActivityHome::class.java)
                startActivity(intent)
                finish()
            }

        }.start()

    }
}



