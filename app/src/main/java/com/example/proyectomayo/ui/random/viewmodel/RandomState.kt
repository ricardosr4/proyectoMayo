package com.example.proyectomayo.ui.random.viewmodel

import com.example.proyectomayo.data.dto.response.DogResponse

sealed class RandomState {
    data class Success(val info : DogResponse) : RandomState()
    data class Error(val message : String) : RandomState()
    data object Loading : RandomState()
}