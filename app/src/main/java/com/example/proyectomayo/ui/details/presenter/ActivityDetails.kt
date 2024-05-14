package com.example.proyectomayo.ui.details.presenter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityDetailsBinding
class ActivityDetails : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}