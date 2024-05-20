package com.example.proyectomayo.ui.puppies.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectomayo.data.repository.DogRepository
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DogViewModel(private val repository : DogRepository = DogRepository()) : ViewModel() {

    private val _data = MutableLiveData<State>()
    val data : LiveData<State> = _data

    fun getDogs(){
        CoroutineScope(Dispatchers.IO).launch {
            val response = repository.getDogs()
            if (response.isSuccessful){
                _data
            }else{

            }
        }
    }
}