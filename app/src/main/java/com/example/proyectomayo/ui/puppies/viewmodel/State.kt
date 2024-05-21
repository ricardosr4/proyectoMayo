package com.example.proyectomayo.ui.puppies.viewmodel

import com.example.proyectomayo.data.dto.response.DogsResponse

sealed class State {
    data class Success(val info : DogsResponse) : State()
    data class Error(val message : String) : State()
    data object Loading : State()
}