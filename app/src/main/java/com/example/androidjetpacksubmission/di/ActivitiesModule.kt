package com.example.androidjetpacksubmission.di

import com.example.androidjetpacksubmission.ui.home.fragments.FragmentProviderModule
import com.example.androidjetpacksubmission.ui.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector(modules = [(FragmentProviderModule::class)])
    abstract fun bindMainActivity(): HomeActivity
}