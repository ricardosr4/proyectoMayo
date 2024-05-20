package com.example.proyectomayo.data.repository

import com.example.proyectomayo.data.dto.response.DogResponse
import com.example.proyectomayo.data.service.DogServiceImp
import retrofit2.Response

class DogRepository(private val service: DogServiceImp = DogServiceImp()) {

    fun getDogs(): Response<DogResponse> {
        return service.getDogs()
    }
}