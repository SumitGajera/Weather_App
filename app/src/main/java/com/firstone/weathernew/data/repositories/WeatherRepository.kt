package com.firstone.weathernew.data.repositories

import com.firstone.weathernew.data.local.WeatherDatabase
import com.firstone.weathernew.data.model.WeatherDataResponse
import com.firstone.weathernew.data.model.WeatherDataResponseNew
import com.firstone.weathernew.data.model.WeatherDetail
import com.firstone.weathernew.data.network.ApiInterface
import com.firstone.weathernew.data.network.SafeApiRequest

class WeatherRepository(
    private val api: ApiInterface,
    private val db: WeatherDatabase
) : SafeApiRequest() {

    suspend fun findCityWeather(cityName: String): WeatherDataResponseNew = apiRequest {

        api.findCityWeatherData(cityName.toLowerCase().trim())
    }

    suspend fun addWeather(weatherDetail: WeatherDetail) {
        db.getWeatherDao().addWeather(weatherDetail)
    }

    suspend fun fetchWeatherDetail(cityName: String): WeatherDetail? =
        db.getWeatherDao().fetchWeatherByCity(cityName)

    suspend fun fetchAllWeatherDetails(): List<WeatherDetail> =
        db.getWeatherDao().fetchAllWeatherDetails()
}
