package com.example.weatherapp.framework.di

import com.example.weatherapp.feature.data.repository.WeatherRepositoryImpl
import com.example.weatherapp.feature.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsRepositoryWeather(repository: WeatherRepositoryImpl): WeatherRepository
}