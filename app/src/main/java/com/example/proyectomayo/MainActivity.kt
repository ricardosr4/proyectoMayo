package com.example.proyectomayo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityMainBinding
import com.example.proyectomayo.view.activity.ActivityHome

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, ActivityHome::class.java)
        startActivity(intent)
        finish()
    }
}



