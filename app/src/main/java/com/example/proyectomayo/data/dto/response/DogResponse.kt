package com.example.proyectomayo.data.dto.response

import com.google.gson.annotations.SerializedName

data class DogResponse(
    @SerializedName("message")
    val message: String?,

    @SerializedName("status")
    val status: String?
)