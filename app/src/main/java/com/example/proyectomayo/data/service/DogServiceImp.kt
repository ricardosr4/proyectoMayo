package com.example.proyectomayo.data.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DogServiceImp  {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://dog.ceo/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}