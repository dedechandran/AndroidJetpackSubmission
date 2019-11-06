package com.example.androidjetpacksubmission.ui.home

import com.example.androidjetpacksubmission.ui.home.movie.MovieFragment
import com.example.androidjetpacksubmission.ui.home.tvshow.TvShowFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentProviderModule {
    @ContributesAndroidInjector
    abstract fun provideMovieFragment(): MovieFragment

    @ContributesAndroidInjector
    abstract fun provideTvShowFragment(): TvShowFragment
}