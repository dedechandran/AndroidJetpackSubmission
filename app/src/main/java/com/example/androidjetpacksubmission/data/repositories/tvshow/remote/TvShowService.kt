package com.example.androidjetpacksubmission.data.repositories.tvshow.remote

import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowDetailResponse
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TvShowService {
    @GET("discover/tv")
    fun getAllTvShow() : Call<TvShowResponse>

    @GET("tv/{id}")
    fun getTvShow(@Path("id") tvId : Int) : Call<TvShowDetailResponse>
}