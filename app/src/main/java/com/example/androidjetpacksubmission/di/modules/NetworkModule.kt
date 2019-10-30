package com.example.androidjetpacksubmission.di.modules

import com.example.androidjetpacksubmission.fixtures.MOVIE_DB_URL
import com.example.androidjetpacksubmission.utils.NetworkInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
object NetworkModule {
    @Singleton
    @Provides
    fun provideGsonConverterFactory() : GsonConverterFactory = GsonConverterFactory.create()

    @Singleton
    @Provides
    fun provideOkHttpClient(networkInterceptor: NetworkInterceptor): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(networkInterceptor)
        .connectTimeout(120, TimeUnit.SECONDS)
        .writeTimeout(90, TimeUnit.SECONDS)
        .readTimeout(90, TimeUnit.SECONDS)
        .build()

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory) : Retrofit =
        Retrofit.Builder().client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .baseUrl(MOVIE_DB_URL)
            .build()
}