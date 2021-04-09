package com.example.demo1.ui.checkFlight

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CheckFlightViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Add check flight function here"
    }
    val text: LiveData<String> = _text
}