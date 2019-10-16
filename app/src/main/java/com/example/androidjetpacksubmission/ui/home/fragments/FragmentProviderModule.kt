package com.example.androidjetpacksubmission.ui.home.fragments

import com.example.androidjetpacksubmission.ui.home.fragments.movie.MovieFragment
import com.example.androidjetpacksubmission.ui.home.fragments.tvshow.TvShowFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentProviderModule {
    @ContributesAndroidInjector
    abstract fun provideMovieFragment(): MovieFragment

    @ContributesAndroidInjector
    abstract fun provideTvShowFragment() : TvShowFragment
}