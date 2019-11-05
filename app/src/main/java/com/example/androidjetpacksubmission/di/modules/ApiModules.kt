package com.example.androidjetpacksubmission.di.modules

import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieService
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
object ApiModules {
    @Singleton
    @Provides
    fun provideMovieService(retrofit: Retrofit): MovieService =
        retrofit.create(MovieService::class.java)

    @Singleton
    @Provides
    fun provideTvShowService(retrofit: Retrofit): TvShowService =
        retrofit.create(TvShowService::class.java)
}