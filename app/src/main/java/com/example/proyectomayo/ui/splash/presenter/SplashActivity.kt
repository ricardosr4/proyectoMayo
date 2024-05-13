package com.example.proyectomayo.ui.splash.presenter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivitySplashBinding
import com.example.proyectomayo.ui.home.presenter.ActivityHome


class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, ActivityHome::class.java)
        startActivity(intent)
        finish()
    }
}



