package com.example.androidjetpacksubmission.ui.home.fragments

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentProviderModule {
    @ContributesAndroidInjector
    abstract fun provideMovieFragment(): MovieFragment

    @ContributesAndroidInjector
    abstract fun provideTvShowFragment() : TvShowFragment
}