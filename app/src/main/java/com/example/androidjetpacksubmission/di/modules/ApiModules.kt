package com.example.androidjetpacksubmission.di.modules

import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
object ApiModules {
    @Singleton
    @Provides
    fun provideMovieService(retrofit: Retrofit) : MovieService = retrofit.create(MovieService::class.java)
}