package com.example.androidjetpacksubmission.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidjetpacksubmission.data.repositories.movie.MovieRepository
import com.example.androidjetpacksubmission.di.ViewModelKey
import com.example.androidjetpacksubmission.ui.home.movie.MovieViewModel
import com.example.androidjetpacksubmission.ui.home.tvshow.TvShowViewModel
import com.example.androidjetpacksubmission.viewmodels.ViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
object ViewModelModule {
    @Provides
    @IntoMap
    @ViewModelKey(MovieViewModel::class)
    fun provideMovieViewModel(movieRepository: MovieRepository): ViewModel =
        MovieViewModel(movieRepository)

    @Provides
    @IntoMap
    @ViewModelKey(TvShowViewModel::class)
    fun provideTvShowViewModel(): ViewModel =
        TvShowViewModel()

    @Singleton
    @Provides
    fun provideViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory =
        viewModelFactory
}