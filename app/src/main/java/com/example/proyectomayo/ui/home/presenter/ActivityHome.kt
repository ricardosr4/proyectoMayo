package com.example.proyectomayo.ui.home.presenter

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.proyectomayo.databinding.ActivityHomeBinding
import com.example.proyectomayo.ui.home.adapter.AdapterHome
import com.example.proyectomayo.ui.home.viewmodel.HomeViewModel
import com.example.proyectomayo.ui.puppies.adapter.Adapter
import com.example.proyectomayo.ui.puppies.presenter.ActivityPuppies
import com.example.proyectomayo.ui.puppies.viewmodel.State
import com.example.proyectomayo.ui.random.presenter.ActivityRandom
import com.example.proyectomayo.ui.search.presenter.ActivitySearch
import com.example.proyectomayo.ui.us.presenter.ActivityUs

class ActivityHome : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    private val viewmodel by viewModels<HomeViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigation()
        call()
        observer()
    }

    private fun call() {
        viewmodel.getDogs()
    }

    private fun observer() {
        viewmodel.data.observe(this) { data ->
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
        val adapter = AdapterHome(list)
        binding.recyclerHome.adapter = adapter
    }

    private fun navigation() {
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

