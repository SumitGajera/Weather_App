package com.firstone.weathernew.ui.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.firstone.weathernew.data.repositories.WeatherRepository
import com.firstone.weathernew.ui.viewmodel.WeatherViewModel

@Suppress("UNCHECKED_CAST")
class WeatherViewModelFactory(
    private val repository: WeatherRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return WeatherViewModel(repository) as T
    }
}
