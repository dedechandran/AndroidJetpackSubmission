package com.example.androidjetpacksubmission.di

import android.content.Context
import com.example.androidjetpacksubmission.AppCore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {
    @Singleton
    @Provides
    fun provideAppContext(app: AppCore): Context = app
}