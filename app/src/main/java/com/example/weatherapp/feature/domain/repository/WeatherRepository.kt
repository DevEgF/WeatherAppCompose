package com.example.weatherapp.feature.domain.repository

import com.example.weatherapp.feature.domain.entity.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Float, lgn: Float): WeatherInfo
}