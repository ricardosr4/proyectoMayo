package com.example.proyectomayo.ui.puppies.presenter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityPuppiesBinding
class ActivityPuppies : AppCompatActivity() {
    private lateinit var binding: ActivityPuppiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityPuppiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}