package com.example.androidjetpacksubmission.data.repositories.movie.remote

import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.mapper.MovieMapper
import com.example.androidjetpacksubmission.domain.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MovieRemoteRepository @Inject constructor(
    private val movieService: MovieService,
    private val movieMapper: MovieMapper
) {
    fun getAllMovies(callback: RepositoryCallback<List<Movie>>) {
        movieService.getAllMovies().enqueue(object : Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                callback.onFailure(t)
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                val movies = movieMapper.transform(response.body()!!)
                callback.onSuccess(movies)
            }

        })
    }
}