package com.example.androidjetpacksubmission.di

import android.app.Application
import android.content.Context
import android.content.res.Resources
import com.example.androidjetpacksubmission.AppCore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideAppContext(app: AppCore): Context = app

    @Singleton
    @Provides
    fun provideResources(appContext: Context) : Resources =  appContext.resources
}