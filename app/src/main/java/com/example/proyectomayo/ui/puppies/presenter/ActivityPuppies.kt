package com.example.proyectomayo.ui.puppies.presenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.proyectomayo.databinding.ActivityPuppiesBinding
import com.example.proyectomayo.response.DogsResponse
import com.example.proyectomayo.ui.puppies.adapter.Adapter

class ActivityPuppies : AppCompatActivity() {
    private lateinit var binding: ActivityPuppiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuppiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView()
    }

    fun recyclerView() {

        val adapter = Adapter(getLista())
        val gridLayoutManager = GridLayoutManager(this, 3)

        binding.recylerPuppies.layoutManager = gridLayoutManager
        binding.recylerPuppies.adapter = adapter

    }

    fun getLista(): List<DogsResponse> {
        return listOf<DogsResponse>()
    }

}