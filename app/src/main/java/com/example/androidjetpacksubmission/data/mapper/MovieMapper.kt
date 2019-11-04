package com.example.androidjetpacksubmission.data.mapper

import android.util.Log
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieResponse
import com.example.androidjetpacksubmission.domain.Movie
import javax.inject.Inject

class MovieMapper @Inject constructor() {
    fun transform(movieResponse: MovieResponse) : List<Movie>{
        val movies = mutableListOf<Movie>()
        movieResponse.data.map {
            movies.add(
                Movie(
                    movieId = it.id,
                    movieReleaseDate = it.releaseDate,
                    movieTitle = it.originalTitle,
                    moviePoster = it.posterUrl,
                    movieOverview = it.overview
                )
            )
        }
        return movies
    }
}