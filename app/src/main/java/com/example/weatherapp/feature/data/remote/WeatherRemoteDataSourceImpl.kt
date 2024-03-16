package com.example.weatherapp.feature.data.remote

import WeatherDataResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject

class WeatherRemoteDataSourceImpl @Inject constructor(
    private val httpClient: HttpClient
): WeatherRemoteDataSource {

    override suspend fun getWeatherDataResponse(lat: Float, lgn: Float): WeatherDataResponse {
        return httpClient
            .get(
                "${BASE_URL}/weather?lat=$lat&lon=$lgn&appid=f14e2005858146142b6b99fae05233ca&units=metric"
            )
            .body()
    }

    companion object {
        private const val BASE_URL = "https://api.openweathermap.org/data/2.5"
    }
}