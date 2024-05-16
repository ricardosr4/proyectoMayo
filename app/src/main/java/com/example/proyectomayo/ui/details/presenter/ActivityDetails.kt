package com.example.proyectomayo.ui.details.presenter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityDetailsBinding
import com.example.proyectomayo.ui.home.presenter.ActivityHome
import com.example.proyectomayo.ui.search.presenter.ActivitySearch

class ActivityDetails : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvBack.setOnClickListener { navigateToSearch() }
        binding.ivBack.setOnClickListener { navigateToSearch() }
    }
    fun navigateToSearch(){
        val intent = Intent(this, ActivitySearch::class.java)
        startActivity(intent)
    }
}