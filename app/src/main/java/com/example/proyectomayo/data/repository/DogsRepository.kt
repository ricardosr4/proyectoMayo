package com.example.proyectomayo.data.repository

import com.example.proyectomayo.data.dto.response.DogsResponse
import com.example.proyectomayo.data.service.DogServiceImp
import retrofit2.Response

class DogsRepository(private val service: DogServiceImp = DogServiceImp()) {

    suspend fun getDogs(): Response<DogsResponse> {
        return service.getDogs()
    }
}