package com.example.androidjetpacksubmission.di.modules

import com.example.androidjetpacksubmission.data.repositories.movie.DefaultMovieRepository
import com.example.androidjetpacksubmission.data.repositories.movie.MovieRepository
import com.example.androidjetpacksubmission.data.repositories.tvshow.DefaultTvShowRepository
import com.example.androidjetpacksubmission.data.repositories.tvshow.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(defaultMovieRepository: DefaultMovieRepository): MovieRepository =
        defaultMovieRepository

    @Singleton
    @Provides
    fun provideTvShowRepository(defaultTvShowRepository: DefaultTvShowRepository): TvShowRepository =
        defaultTvShowRepository
}