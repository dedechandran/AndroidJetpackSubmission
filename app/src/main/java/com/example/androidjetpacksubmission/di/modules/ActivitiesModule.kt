package com.example.androidjetpacksubmission.di.modules

import com.example.androidjetpacksubmission.ui.home.movie.MovieDetailActivity
import com.example.androidjetpacksubmission.ui.home.tvshow.TvShowDetailActivity
import com.example.androidjetpacksubmission.ui.home.FragmentProviderModule
import com.example.androidjetpacksubmission.ui.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector(modules = [(FragmentProviderModule::class)])
    abstract fun bindMainActivity(): HomeActivity

    @ContributesAndroidInjector
    abstract fun bindMovieDetailActivity(): MovieDetailActivity

    @ContributesAndroidInjector
    abstract fun bindTvShowDetailActivity(): TvShowDetailActivity
}