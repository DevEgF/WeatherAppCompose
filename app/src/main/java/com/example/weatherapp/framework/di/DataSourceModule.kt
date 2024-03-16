package com.example.weatherapp.framework.di

import com.example.weatherapp.feature.data.remote.WeatherRemoteDataSource
import com.example.weatherapp.feature.data.remote.WeatherRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    fun bindsWeatherDataSource(dataSource: WeatherRemoteDataSourceImpl): WeatherRemoteDataSource
}