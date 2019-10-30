package com.example.androidjetpacksubmission.di

import com.example.androidjetpacksubmission.utils.NetworkInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
object NetworkModule {
    @Provides
    fun provideGsonConverterFactory() : GsonConverterFactory = GsonConverterFactory.create()

    @Provides
    fun provideOkHttpClient(networkInterceptor: NetworkInterceptor): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(networkInterceptor)
        .connectTimeout(120, TimeUnit.SECONDS)
        .writeTimeout(90, TimeUnit.SECONDS)
        .readTimeout(90, TimeUnit.SECONDS)
        .build()

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory) : Retrofit =
        Retrofit.Builder().client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
}