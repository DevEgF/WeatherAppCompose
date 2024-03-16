package com.example.weatherapp.feature.presentation.state

import com.example.weatherapp.feature.domain.entity.WeatherInfo

data class WeatherInfoState(
    val weatherInfo: WeatherInfo? = null
)