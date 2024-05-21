package com.example.proyectomayo.ui.random.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectomayo.data.repository.DogRepository
import com.example.proyectomayo.ui.puppies.viewmodel.State
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RandomViewModel(private val repository: DogRepository = DogRepository()) : ViewModel() {

    private val _data = MutableLiveData<RandomState>()
    val data: LiveData<RandomState> = _data

    fun getDogs() {
        CoroutineScope(Dispatchers.IO).launch {
            _data.postValue(RandomState.Loading)
            val response = repository.getDog()
            if (response.isSuccessful) {
                response.body()?.let {
                    _data.postValue(RandomState.Success(it))
                } ?: _data.postValue(RandomState.Error("No data"))
            } else {
                _data.postValue(RandomState.Error("Error en el service"))
            }
        }
    }
}
