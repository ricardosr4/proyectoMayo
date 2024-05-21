package com.example.proyectomayo.ui.details.presenter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.databinding.ActivityDetailsBinding
import com.example.proyectomayo.ui.home.presenter.ActivityHome
import com.example.proyectomayo.ui.puppies.presenter.ActivityPuppies.Companion.randomValueItem
import com.example.proyectomayo.ui.random.presenter.ActivityRandom.Companion.valueItem
import com.example.proyectomayo.ui.search.presenter.ActivitySearch
import com.squareup.picasso.Picasso

class ActivityDetails : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getImage()
        getImagePuppy()
        binding.tvBack.setOnClickListener { navigateToSearch() }
        binding.ivBack.setOnClickListener { navigateToSearch() }
    }
    private fun navigateToSearch(){
        val intent = Intent(this, ActivitySearch::class.java)
        startActivity(intent)
    }

    private fun getImage(){
        if(valueItem != ""){
            Picasso.get().load(valueItem).into(binding.ivDetails)
        }
    }


    private fun getImagePuppy(){
        if(randomValueItem != ""){
        Picasso.get().load(randomValueItem).into(binding.ivDetails)
         }
    }


}