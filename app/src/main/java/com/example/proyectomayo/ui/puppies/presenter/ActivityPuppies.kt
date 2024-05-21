package com.example.proyectomayo.ui.puppies.presenter

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.proyectomayo.databinding.ActivityPuppiesBinding
import com.example.proyectomayo.ui.home.presenter.ActivityHome
import com.example.proyectomayo.ui.puppies.adapter.Adapter
import com.example.proyectomayo.ui.puppies.viewmodel.PuppiesViewModel
import com.example.proyectomayo.ui.puppies.viewmodel.State

class ActivityPuppies : AppCompatActivity() {
    private lateinit var binding: ActivityPuppiesBinding

    private val viewModel by viewModels<PuppiesViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuppiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigateToHome()
        navigateToHome2()
        call()
        observer()
    }

    private fun call() {
        viewModel.getDogs()
    }

    private fun observer() {
        viewModel.data.observe(this) { data ->
            when (data) {
                is State.Success -> {
                    hideLoading()
                    initRecyclerView(data.info.message ?: listOf())
                }

                is State.Loading -> {
                    showLoading()
                }

                is State.Error -> {

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

    private fun initRecyclerView(list: List<String>) {
        val adapter = Adapter(list)
        val gridLayoutManager = GridLayoutManager(this, 3)

        binding.recyclerPuppies.layoutManager = gridLayoutManager
        binding.recyclerPuppies.adapter = adapter
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