package com.example.androidjetpacksubmission.utils

import android.content.res.Resources
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.domain.TvShow
import javax.inject.Inject

class DummyData @Inject constructor(private val resources: Resources) {
    fun getMovieList() : List<Movie>{
        val movies = mutableListOf<Movie>()
        val movieTitles = resources.getStringArray(R.array.movie_titles)
        val moviePosters = resources.obtainTypedArray(R.array.movie_posters)
        val movieOverviews = resources.getStringArray(R.array.movie_overviews)
        for (i in movieTitles.indices) {
            movies.add(
                Movie(
                    movieId = i.toShort(),
                    movieTitle = movieTitles[i],
                    moviePoster = moviePosters.getResourceId(i,0),
                    movieOverview = movieOverviews[i],
                    movieDuration = 0,
                    movieGenres = listOf(),
                    movieHomePage = "",
                    movieLanguages = listOf(),
                    moviePopularity = 0.0,
                    movieProductionCompanies = listOf(),
                    movieProductionCountries = listOf(),
                    movieReleaseDate = "",
                    movieStatus = "",
                    movieVoteAverage = 0.0,
                    movieVoteCount = 0
                )
            )
        }
        moviePosters.recycle()
        return movies
    }

    fun getTvShowList() {
        val tvShows = mutableListOf<TvShow>()
    }

}