package com.example.proyectomayo.ui.us.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectomayo.R
import com.example.proyectomayo.data.dto.response.UsResponse
import com.example.proyectomayo.databinding.ItemUsBinding
import com.squareup.picasso.Picasso

class UsAdapter(val listUs: List<UsResponse>) : RecyclerView.Adapter<UsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_us, parent, false)
        return UsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listUs.size
    }

    override fun onBindViewHolder(holder: UsViewHolder, position: Int) {
        holder.render(listUs[position])
    }
}

class UsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemUsBinding.bind(view)

    fun render(usResponse: UsResponse){
        Picasso.get().load(usResponse.image).into(binding.ivUs)
    }
}