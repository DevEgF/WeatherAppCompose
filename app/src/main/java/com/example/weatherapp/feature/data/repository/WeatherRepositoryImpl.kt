package com.example.weatherapp.feature.data.repository

import com.example.weatherapp.feature.data.remote.WeatherRemoteDataSource
import com.example.weatherapp.feature.domain.entity.WeatherInfo
import com.example.weatherapp.feature.domain.repository.WeatherRepository
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale
import javax.inject.Inject
import kotlin.math.roundToInt

class WeatherRepositoryImpl @Inject constructor(
    private val weatherRemoteDataSource: WeatherRemoteDataSource
): WeatherRepository {

    override suspend fun getWeatherData(lat: Float, lgn: Float): WeatherInfo {
        val response = weatherRemoteDataSource.getWeatherDataResponse(lat,lgn)
        val weather = response.weather[0]

        return WeatherInfo(
            locationName = response.name,
            conditionIcon = weather.icon,
            condition = weather.main,
            temperature = response.main.temp.roundToInt(),
            dayOfWeek = LocalDate.now().dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()),
            isDay = weather.icon.last() == 'd'
        )
    }
}