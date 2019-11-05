package com.example.androidjetpacksubmission.di.component

import com.example.androidjetpacksubmission.AppCore
import com.example.androidjetpacksubmission.di.modules.*
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        (AndroidInjectionModule::class),
        (ActivitiesModule::class),
        (AppModule::class),
        (ViewModelModule::class),
        (NetworkModule::class),
        (ApiModules::class),
        (RepositoryModule::class)]
)
interface AppComponent : AndroidInjector<AppCore> {
    @Component.Factory
    abstract class Builder : AndroidInjector.Factory<AppCore>
}