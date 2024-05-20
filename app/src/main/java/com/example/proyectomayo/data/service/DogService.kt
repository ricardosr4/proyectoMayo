package com.example.proyectomayo.data.service

import com.example.proyectomayo.data.dto.response.DogResponse
import retrofit2.Response
import retrofit2.http.GET

interface DogService {

    @GET("breed/hound/images")
    fun getDogs(): Response<DogResponse>
}