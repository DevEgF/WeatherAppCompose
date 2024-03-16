package com.example.weatherapp.feature.data.remote

import WeatherDataResponse

interface WeatherRemoteDataSource {
    suspend fun getWeatherDataResponse(lat: Float, lgn:Float): WeatherDataResponse
}