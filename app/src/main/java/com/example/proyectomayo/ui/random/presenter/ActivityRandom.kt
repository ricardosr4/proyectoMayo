package com.example.proyectomayo.ui.random.presenter

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityRandomBinding
import com.example.proyectomayo.ui.details.presenter.ActivityDetails
import com.example.proyectomayo.ui.home.presenter.ActivityHome
import com.example.proyectomayo.ui.puppies.viewmodel.PuppiesViewModel
import com.example.proyectomayo.ui.puppies.viewmodel.State
import com.example.proyectomayo.ui.random.viewmodel.RandomState
import com.example.proyectomayo.ui.random.viewmodel.RandomViewModel
import com.squareup.picasso.Picasso

class ActivityRandom : AppCompatActivity() {
    private lateinit var binding: ActivityRandomBinding

    companion object{
        var valueItem = ""
    }

    private val viewModel by viewModels<RandomViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigateToHome()
        navigateToHome2()
        call()
        observer()
        reload()
    }
    private fun reload(){
    binding.imagePaw.setOnClickListener {
        val myIntent = Intent(this, ActivityRandom::class.java)
        startActivity(myIntent)
    }
    }
    private fun call() {
        viewModel.getDogs()
    }

    private fun observer() {
        viewModel.data.observe(this) { data ->
            when (data) {
                is RandomState.Success -> {
                    hideLoading()
                    val picasso = Picasso.get().load(data.info.message ?: "").into(binding.imagenPerrito)
                    valueItem = data.info.message!!
                    binding.imagenPerrito.setOnClickListener {
                        val intent = Intent(this, ActivityDetails::class.java)
                        valueItem = data.info.message
                        startActivity(intent) }
                }

                is RandomState.Loading -> {
                    showLoading()
                }

                is RandomState.Error -> {

                }
            }
        }
    }

    private fun showLoading() {
        binding.loading.visibility = View.VISIBLE
    }

    private fun hideLoading() {
        binding.loading.visibility = View.GONE
    }
    private fun navigateToHome() {
        binding.cardView.setOnClickListener() {
            val intent = Intent(this, ActivityHome::class.java)
            startActivity(intent)
        }
    }

    private fun navigateToHome2() {
        binding.cardView2.setOnClickListener() {
            val intent = Intent(this, ActivityHome::class.java)
            startActivity(intent)
        }
    }
}

