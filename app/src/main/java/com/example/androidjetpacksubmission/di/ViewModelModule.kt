package com.example.androidjetpacksubmission.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.androidjetpacksubmission.utils.DummyData
import com.example.androidjetpacksubmission.viewmodels.MovieViewModel
import com.example.androidjetpacksubmission.viewmodels.ViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class ViewModelModule {
    @Provides
    @IntoMap
    @ViewModelKey(MovieViewModel::class)
    fun provideMovieViewModel(dummyData: DummyData) : ViewModel =
        MovieViewModel(dummyData)

    @Provides
    fun provideViewModelFactory(viewModelFactory: ViewModelFactory) : ViewModelProvider.Factory = viewModelFactory
}