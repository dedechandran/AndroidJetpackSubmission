package com.example.androidjetpacksubmission.data.repositories.movie.remote


import com.example.androidjetpacksubmission.base.RepositoryCallback


interface MovieRemoteDataSource {
    fun loadMovies(callback: RepositoryCallback<MovieResponse>)
    fun loadMovieDetail(movieId: Int, callback: RepositoryCallback<MovieDetailResponse>)
}