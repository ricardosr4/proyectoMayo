package com.example.proyectomayo.ui.us.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectomayo.R
import com.example.proyectomayo.data.dto.response.MemberResponse
import com.example.proyectomayo.databinding.ItemMemberBinding
import com.squareup.picasso.Picasso

class MembersAdapter(val listMember:List<MemberResponse>): RecyclerView.Adapter<MemberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_member,parent,false)
        return MemberViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listMember.size
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.render(listMember[position])
    }
}

class MemberViewHolder(view:View):RecyclerView.ViewHolder(view){
    val binding = ItemMemberBinding.bind(view)
    fun render(usMemberResponse: MemberResponse){
        binding.tvNameMember.text = usMemberResponse.name
        Picasso.get().load(usMemberResponse.image).into(binding.ivMember)

    }
}