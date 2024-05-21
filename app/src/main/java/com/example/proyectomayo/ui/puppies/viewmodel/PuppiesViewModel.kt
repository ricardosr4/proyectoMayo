package com.example.proyectomayo.ui.puppies.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectomayo.data.repository.DogRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PuppiesViewModel(private val repository: DogRepository = DogRepository()) : ViewModel() {

    private val _data = MutableLiveData<State>()
    val data: LiveData<State> = _data

    fun getDogs() {
        CoroutineScope(Dispatchers.IO).launch {
            _data.postValue(State.Loading)
            val response = repository.getDogs()
            if (response.isSuccessful) {
                response.body()?.let {
                    _data.postValue(State.Success(it))
                } ?: _data.postValue(State.Error("No data"))
            } else {
                _data.postValue(State.Error("Error en el service"))
            }
        }
    }
}