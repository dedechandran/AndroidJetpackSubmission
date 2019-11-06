package com.example.androidjetpacksubmission.data.repositories.movie.remote


import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.repositories.movie.remote.response.MovieDetailResponse
import com.example.androidjetpacksubmission.data.repositories.movie.remote.response.MovieResponse


interface MovieRemoteDataSource {
    fun loadMovies(callback: RepositoryCallback<MovieResponse>)
    fun loadMovieDetail(movieId: Int, callback: RepositoryCallback<MovieDetailResponse>)
}