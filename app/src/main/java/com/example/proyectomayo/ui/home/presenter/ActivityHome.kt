package com.example.proyectomayo.ui.home.presenter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityHomeBinding
import com.example.proyectomayo.ui.puppies.presenter.ActivityPuppies
import com.example.proyectomayo.ui.random.presenter.ActivityRandom
import com.example.proyectomayo.ui.search.presenter.ActivitySearch
import com.example.proyectomayo.ui.us.presenter.ActivityUs

class ActivityHome : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigation()
    }

    fun navigation() {
        binding.btRandom.setOnClickListener {
            val myIntent = Intent(this, ActivityRandom::class.java)
            startActivity(myIntent)
        }

        binding.btSearch.setOnClickListener {
            val myIntent = Intent(this, ActivitySearch::class.java)
            startActivity(myIntent)
        }

        binding.btUs.setOnClickListener {
            val myIntent = Intent(this, ActivityUs::class.java)
            startActivity(myIntent)
        }

        binding.btPuppies.setOnClickListener {
            val myIntent = Intent(this, ActivityPuppies::class.java)
            startActivity(myIntent)
        }
    }
}

