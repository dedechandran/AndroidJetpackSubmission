package com.example.androidjetpacksubmission.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidjetpacksubmission.utils.DummyData
import com.example.androidjetpacksubmission.viewmodels.MovieViewModel
import com.example.androidjetpacksubmission.viewmodels.TvShowViewModel
import com.example.androidjetpacksubmission.viewmodels.ViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
object ViewModelModule {
    @Provides
    @IntoMap
    @ViewModelKey(MovieViewModel::class)
    fun provideMovieViewModel(dummyData: DummyData): ViewModel =
        MovieViewModel(dummyData)

    @Provides
    @IntoMap
    @ViewModelKey(TvShowViewModel::class)
    fun provideTvShowViewModel(dummyData: DummyData): ViewModel =
        TvShowViewModel(dummyData)

    @Provides
    fun provideViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory =
        viewModelFactory
}