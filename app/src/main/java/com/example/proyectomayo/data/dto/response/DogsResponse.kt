package com.example.proyectomayo.data.dto.response

import com.google.gson.annotations.SerializedName

data class DogsResponse(
    @SerializedName("message")
    val message: List<String>?,

    @SerializedName("status")
    val status: String?
)
