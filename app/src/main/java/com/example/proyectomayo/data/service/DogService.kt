package com.example.proyectomayo.data.service

import com.example.proyectomayo.data.dto.response.DogsResponse
import okhttp3.Response
import retrofit2.http.GET

interface DogService {

    @GET("breeds/image/random/50")
    fun getDogs() : Response
}