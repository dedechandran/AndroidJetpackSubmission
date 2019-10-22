package com.example.androidjetpacksubmission.di

import com.example.androidjetpacksubmission.ui.MovieDetailActivity
import com.example.androidjetpacksubmission.ui.TvShowDetailActivity
import com.example.androidjetpacksubmission.ui.home.fragments.FragmentProviderModule
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