package com.example.proyectomayo.view.activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityUsBinding
class ActivityUs : AppCompatActivity() {
    private lateinit var binding: ActivityUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}