package com.example.proyectomayo.ui.puppies.presenter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.proyectomayo.databinding.ActivityPuppiesBinding
import com.example.proyectomayo.data.dto.response.DogResponse
import com.example.proyectomayo.ui.home.presenter.ActivityHome
import com.example.proyectomayo.ui.puppies.adapter.Adapter

class ActivityPuppies : AppCompatActivity() {
    private lateinit var binding: ActivityPuppiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuppiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigateToHome()
        navigateToHome2()
        recyclerView()

    }

    fun recyclerView() {

        val adapter = Adapter(getLista())
        val gridLayoutManager = GridLayoutManager(this, 3)

        binding.recylerPuppies.layoutManager = gridLayoutManager
        binding.recylerPuppies.adapter = adapter

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

    fun getLista(): List<DogResponse> {
        return listOf<DogResponse>()
    }

}