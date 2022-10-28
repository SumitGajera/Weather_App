package com.firstone.weathernew.data.model


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class WeatherDataResponseNew(
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("temperature")
    val temperature: Double,
    @SerializedName("description")
    val description: String,
    @SerializedName("dt")
    val dt: Int,
    @SerializedName("id")
    val id: Int,

)