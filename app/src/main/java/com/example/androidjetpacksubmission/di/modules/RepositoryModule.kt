package com.example.androidjetpacksubmission.di.modules

import com.example.androidjetpacksubmission.data.repositories.movie.MovieRepository
import com.example.androidjetpacksubmission.data.repositories.movie.MovieRepositoryImpl
import com.example.androidjetpacksubmission.data.repositories.tvshow.TvShowRepository
import com.example.androidjetpacksubmission.data.repositories.tvshow.TvShowRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(movieRepositoryImpl: MovieRepositoryImpl): MovieRepository =
        movieRepositoryImpl

    @Singleton
    @Provides
    fun provideTvShowRepository(tvShowRepositoryImpl: TvShowRepositoryImpl): TvShowRepository =
        tvShowRepositoryImpl
}