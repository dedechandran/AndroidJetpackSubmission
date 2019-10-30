package com.example.androidjetpacksubmission.data.repositories.movie.remote


import retrofit2.http.GET
import retrofit2.http.Path

interface MovieService  {
    @GET("/discover/movie")
    suspend fun getAllMovies() : List<MovieResponse>

    @GET("/movie/{id}")
    suspend fun getMovie(@Path("id") movieId: String) : MovieResponse
}
