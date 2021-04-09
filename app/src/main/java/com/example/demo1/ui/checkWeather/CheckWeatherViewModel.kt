package com.example.demo1.ui.checkWeather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CheckWeatherViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Add check airport weather in this page"
    }
    val text: LiveData<String> = _text
}