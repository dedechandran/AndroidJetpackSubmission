package com.example.androidjetpacksubmission.utils

import android.content.res.Resources
import android.content.res.TypedArray
import android.util.Log
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.domain.TvShow
import com.example.androidjetpacksubmission.fixtures.*
import java.lang.reflect.Field
import java.text.NumberFormat
import javax.inject.Inject
import kotlin.reflect.KClass

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
            val field = res.getField("movie_${counter}")
            val movie = resources.obtainTypedArray(field.getInt(null))
            tvShows.add(
                TvShow(
                    tvShowId = movie.getInt(MOVIE_ID_INDEX, 0).toShort(),
                    tvShowTitle = movie.getString(MOVIE_TITLE_INDEX)!!,
                    tvShowPoster = movie.getResourceId(MOVIE_POSTER_INDEX, 0),
                    tvShowOverview = movie.getString(MOVIE_DESCRIPTION_INDEX)!!,
                    tvShowReleaseDate = movie.getString(MOVIE_RELEASE_DATE_INDEX)!!,
                    tvShowLanguage = movie.getString(MOVIE_LANGUAGE_INDEX)!!,
                    tvShowDuration = movie.getString(MOVIE_DURATION_INDEX)!!,
                    tvShowGenres = movie.getString(MOVIE_GENRES_INDEX)!!.split(';')
                )
            )
            if (counter == AVAILABLE_TV_SHOWS) {
                allTaken = true
            }
            movie.recycle()
            counter++
        } while (!allTaken)
        return tvShows
    }

}