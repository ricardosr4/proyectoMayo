package com.example.proyectomayo.ui.random.presenter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityRandomBinding
import com.example.proyectomayo.ui.home.presenter.ActivityHome

class ActivityRandom : AppCompatActivity() {
    private lateinit var binding: ActivityRandomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigateToHome()
        navigateToHome2()
    }

    fun navigateToHome() {
        binding.cardView.setOnClickListener() {
            val intent = Intent(this, ActivityHome::class.java)
            startActivity(intent)
        }
    }

    fun navigateToHome2() {
        binding.cardView2.setOnClickListener() {
            val intent = Intent(this, ActivityHome::class.java)
            startActivity(intent)
        }
    }
}