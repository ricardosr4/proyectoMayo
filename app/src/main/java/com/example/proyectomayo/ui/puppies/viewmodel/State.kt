package com.example.proyectomayo.ui.puppies.viewmodel

import com.example.proyectomayo.data.dto.response.DogResponse

sealed class State {
    data class Success(val info : DogResponse) : State()
    data class Error(val message : String) : State()
    data object Loading : State()
}