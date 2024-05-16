package com.example.proyectomayo.ui.search.presenter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivitySearchBinding
import com.example.proyectomayo.ui.details.presenter.ActivityDetails
import com.example.proyectomayo.ui.home.presenter.ActivityHome

class ActivitySearch : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvImage.setOnClickListener { navigateToDetails() }
        binding.tvBack.setOnClickListener { navigateToHome() }
        binding.ivBack.setOnClickListener { navigateToHome() }


    }
    fun navigateToDetails(){
        val intent = Intent(this, ActivityDetails::class.java)
        startActivity(intent)
    }
    fun navigateToHome(){
        val intent = Intent(this, ActivityHome::class.java)
        startActivity(intent)
    }
}