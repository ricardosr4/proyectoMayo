package com.example.proyectomayo.ui.us.presenter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityUsBinding
import com.example.proyectomayo.ui.home.presenter.ActivityHome

class ActivityUs : AppCompatActivity() {
    private lateinit var binding: ActivityUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener{ navigateToHome()}
    }
     fun navigateToHome(){
        val intent = Intent(this, ActivityHome::class.java)
         startActivity(intent)
    }
}