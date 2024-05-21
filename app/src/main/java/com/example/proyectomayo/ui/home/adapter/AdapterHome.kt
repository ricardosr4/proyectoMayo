package com.example.proyectomayo.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.proyectomayo.R
import com.example.proyectomayo.databinding.ItemHomeBinding
import com.squareup.picasso.Picasso

class AdapterHome(private val myList : List<String>) : RecyclerView.Adapter<HomeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return HomeHolder(view)
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
        holder.render(myList[position])
    }

    override fun getItemCount(): Int {
        return myList.size
    }
}

class HomeHolder(private val view : View) : ViewHolder(view){
    private val  binding = ItemHomeBinding.bind(view)

    fun render(image : String){
       Picasso.get().load(image).into(binding.imageHome)
    }

}