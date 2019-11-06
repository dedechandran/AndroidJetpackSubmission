package com.example.androidjetpacksubmission.di.modules

import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieRemoteDataSource
import com.example.androidjetpacksubmission.data.repositories.movie.remote.DefaultMovieRemoteDataSource
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.DefaultTvShowRemoteDataSource
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DataSourceModule {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(defaultMovieRemoteDataSource: DefaultMovieRemoteDataSource): MovieRemoteDataSource =
        defaultMovieRemoteDataSource

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(defaultTvShowRemoteDataSource: DefaultTvShowRemoteDataSource): TvShowRemoteDataSource =
        defaultTvShowRemoteDataSource
}