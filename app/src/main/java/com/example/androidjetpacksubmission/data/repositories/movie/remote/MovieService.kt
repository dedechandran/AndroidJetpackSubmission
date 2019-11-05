package com.example.androidjetpacksubmission.data.repositories.movie.remote


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieService  {
    @GET("discover/movie")
    fun getAllMovies() : Call<MovieResponse>

    @GET("movie/{id}")
    fun getMovie(@Path("id") movieId: Int) : Call<MovieDetailResponse>
}
