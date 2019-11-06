package com.example.androidjetpacksubmission.utils

import com.example.androidjetpacksubmission.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class NetworkInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val apiKey = BuildConfig.API_KEY
        val url = chain.request().url
            .newBuilder()
            .addQueryParameter("api_key",apiKey)
            .build()
        val request = chain.request().newBuilder().url(url).build()
        return chain.proceed(request)
    }
}