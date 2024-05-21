package com.example.proyectomayo.ui.puppies.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.proyectomayo.R
import com.example.proyectomayo.databinding.ItemPuppyBinding
import com.squareup.picasso.Picasso

class Adapter(private val miList: List<String>, private val nav : (String) -> Unit) : RecyclerView.Adapter<MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_puppy, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int = miList.size


    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.render(miList[position], nav)
    }
}

class MyHolder(private val view: View) : ViewHolder(view) {

    private val binding = ItemPuppyBinding.bind(view)

    fun render(image: String, nav: (String) -> Unit) {
        Picasso.get().load(image).into(binding.imagePuppy)
        binding.imagePuppy.setOnClickListener { nav.invoke(image) }
    }
}