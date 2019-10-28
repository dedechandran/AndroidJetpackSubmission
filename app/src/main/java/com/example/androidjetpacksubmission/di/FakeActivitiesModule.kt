package com.example.androidjetpacksubmission.di

import com.example.androidjetpacksubmission.testing.SingleFragmentActivity
import com.example.androidjetpacksubmission.ui.home.fragments.FragmentProviderModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FakeActivitiesModule {
    @ContributesAndroidInjector(modules = [(FragmentProviderModule::class)])
    abstract fun bindSingleFragmentActivity(): SingleFragmentActivity
}