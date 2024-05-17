package com.example.proyectomayo.ui.puppies.presenter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.proyectomayo.databinding.ActivityPuppiesBinding
import com.example.proyectomayo.response.DogsResponse
import com.example.proyectomayo.ui.puppies.adapter.Adapter

class ActivityPuppies : AppCompatActivity() {
    private lateinit var binding: ActivityPuppiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityPuppiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView()
    }

    fun recyclerView(){

        val adapater = Adapter(getLista())
        binding.recylerPuppies.adapter = adapater

    }
    fun getLista () :List<DogsResponse>{
        return listOf<DogsResponse>(
            DogsResponse(image =  "https://images.dog.ceo/breeds/airedale/n02096051_7077.jpg"))
            }

}