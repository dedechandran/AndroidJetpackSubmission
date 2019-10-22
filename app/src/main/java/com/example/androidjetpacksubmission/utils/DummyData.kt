package com.example.androidjetpacksubmission.utils

import android.content.res.Resources
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.domain.TvShow
import com.example.androidjetpacksubmission.fixtures.*
import java.text.NumberFormat
import javax.inject.Inject

class DummyData @Inject constructor(private val resources: Resources) {
    fun getMovieList(): List<Movie> {
        val currency = NumberFormat.getCurrencyInstance()
        val movies = mutableListOf<Movie>()
        var counter = 1
        val res = R.array::class.java
        var allTaken = false
        do {
            val field = res.getField("movie_${counter}")
            val movie = resources.obtainTypedArray(field.getInt(null))
            movies.add(
                Movie(
                    movieId = movie.getInt(MOVIE_ID_INDEX, 0).toShort(),
                    movieTitle = movie.getString(MOVIE_TITLE_INDEX)!!,
                    moviePoster = movie.getResourceId(MOVIE_POSTER_INDEX, 0),
                    movieOverview = movie.getString(MOVIE_DESCRIPTION_INDEX)!!,
                    movieReleaseDate = movie.getString(MOVIE_RELEASE_DATE_INDEX)!!,
                    movieLanguage = movie.getString(MOVIE_LANGUAGE_INDEX)!!,
                    movieDuration = movie.getString(MOVIE_DURATION_INDEX)!!,
                    movieGenres = movie.getString(MOVIE_GENRES_INDEX)!!.split(';'),
                    movieBudget = currency.format(movie.getInt(MOVIE_BUDGET_INDEX,0).toLong()),
                    movieRevenue = currency.format(movie.getInt(MOVIE_REVENUE_INDEX,0).toLong())
                )
            )
            if (counter == AVAILABLE_MOVIE) {
                allTaken = true
            }
            movie.recycle()
            counter++
        } while (!allTaken)

        return movies
    }

    fun getTvShowList(): List<TvShow> {
        val tvShows = mutableListOf<TvShow>()
        var counter = 1
        val res = R.array::class.java
        var allTaken = false
        do {
            val field = res.getField("tv_show_${counter}")
            val tvShow = resources.obtainTypedArray(field.getInt(null))
            tvShows.add(
                TvShow(
                    tvShowId = tvShow.getInt(TV_SHOW_ID_INDEX, 0).toShort(),
                    tvShowTitle = tvShow.getString(TV_SHOW_TITLE_INDEX)!!,
                    tvShowPoster = tvShow.getResourceId(TV_SHOW_POSTER_INDEX, 0),
                    tvShowOverview = tvShow.getString(TV_SHOW_DESCRIPTION_INDEX)!!,
                    tvShowReleaseDate = tvShow.getString(TV_SHOW_RELEASE_DATE_INDEX)!!,
                    tvShowLanguage = tvShow.getString(TV_SHOW_LANGUAGE_INDEX)!!,
                    tvShowDuration = tvShow.getString(TV_SHOW_DURATION_INDEX)!!,
                    tvShowGenres = tvShow.getString(TV_SHOW_GENRES_INDEX)!!.split(';'),
                    tvShowType = tvShow.getString(TV_SHOW_TYPE_INDEX)!!
                )
            )
            if (counter == AVAILABLE_TV_SHOWS) {
                allTaken = true
            }
            tvShow.recycle()
            counter++
        } while (!allTaken)
        return tvShows
    }

}