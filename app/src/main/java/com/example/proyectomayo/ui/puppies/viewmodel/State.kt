package com.example.proyectomayo.ui.puppies.viewmodel

sealed class State {

    data class Success(private val info : List<String>) : State()
    data class Error(private val message : String) : State()
    data object Loading : State()
}