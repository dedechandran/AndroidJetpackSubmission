package com.example.androidjetpacksubmission.data.mapper

import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieDetailResponse
import com.example.androidjetpacksubmission.data.repositories.movie.remote.MovieResponse
import com.example.androidjetpacksubmission.domain.Movie
import javax.inject.Inject

class MovieMapper @Inject constructor() {
    fun transform(movieResponse: MovieResponse): List<Movie> {
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

    fun transform(movieDetailResponse: MovieDetailResponse): Movie =
        Movie(
            movieId = movieDetailResponse.id,
            movieOverview = movieDetailResponse.overview,
            moviePoster = movieDetailResponse.posterUrl,
            movieTitle = movieDetailResponse.originalTitle,
            movieReleaseDate = movieDetailResponse.releaseDate,
            movieLanguage = movieDetailResponse.originalLanguage,
            movieRevenue = movieDetailResponse.revenue,
            movieBudget = movieDetailResponse.budget,
            movieDuration = movieDetailResponse.runtime,
            movieGenres = movieDetailResponse.genres.map {
                it.name
            }

        )
}