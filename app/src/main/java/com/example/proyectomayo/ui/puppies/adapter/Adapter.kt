package com.example.proyectomayo.ui.puppies.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.proyectomayo.databinding.RecyclerPuppiesBinding

class Adapter : RecyclerView.Adapter<holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: holder, position: Int) {
        TODO("Not yet implemented")
    }
}

class holder(private val view : View) : ViewHolder(view) {

    val binding = RecyclerPuppiesBinding.bind(view)
    fun render(){
        binding.imagePuppie

    }
}