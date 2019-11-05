package com.example.androidjetpacksubmission.data.repositories.tvshow.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TvShowService {
    @GET("discover/tv")
    fun getAllTvShow() : Call<TvShowResponse>

    @GET("tv/{id}")
    fun getTvShow(@Path("id") tvId : Int) : Call<TvShowDetailResponse>
}