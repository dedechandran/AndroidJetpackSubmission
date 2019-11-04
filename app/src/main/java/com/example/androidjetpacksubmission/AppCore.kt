package com.example.androidjetpacksubmission

import com.example.androidjetpacksubmission.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

open class AppCore : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication>  =
        DaggerAppComponent.factory().create(this)
}