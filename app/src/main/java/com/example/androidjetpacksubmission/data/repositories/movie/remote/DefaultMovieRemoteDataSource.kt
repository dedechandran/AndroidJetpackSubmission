package com.example.androidjetpacksubmission.data.repositories.movie.remote

import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.repositories.movie.remote.response.MovieDetailResponse
import com.example.androidjetpacksubmission.data.repositories.movie.remote.response.MovieResponse
import com.example.androidjetpacksubmission.utils.EspressoIdlingResourceHelper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class DefaultMovieRemoteDataSource @Inject constructor(
    private val movieService: MovieService
) : MovieRemoteDataSource {

    override
    fun loadMovies(callback: RepositoryCallback<MovieResponse>) {
        EspressoIdlingResourceHelper.increment()
        movieService.getAllMovies().enqueue(object : Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                callback.onFailure(t)
                EspressoIdlingResourceHelper.decrement()
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                if (response.isSuccessful) {
                    response.body()?.let { callback.onSuccess(it) }
                }
                EspressoIdlingResourceHelper.decrement()
            }

        })
    }

    override
    fun loadMovieDetail(movieId: Int, callback: RepositoryCallback<MovieDetailResponse>) {
        EspressoIdlingResourceHelper.increment()
        movieService.getMovie(movieId).enqueue(object : Callback<MovieDetailResponse> {
            override fun onFailure(call: Call<MovieDetailResponse>, t: Throwable) {
                callback.onFailure(t)
                EspressoIdlingResourceHelper.decrement()
            }

            override fun onResponse(
                call: Call<MovieDetailResponse>,
                response: Response<MovieDetailResponse>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { callback.onSuccess(it) }
                }
                EspressoIdlingResourceHelper.decrement()
            }

        })
    }
}