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
        currency.minimumFractionDigits = 0

        val movies = mutableListOf<Movie>()
        val moviePosters = resources.obtainTypedArray(R.array.movie_posters)
        val movieTitles = resources.getStringArray(R.array.movie_titles)
        val movieOverviews = resources.getStringArray(R.array.movie_overviews)
        val movieReleaseDates = resources.getStringArray(R.array.movie_release_dates)
        val movieLanguages = resources.getStringArray(R.array.movie_languages)
        val movieDurations = resources.getStringArray(R.array.movie_durations)
        val movieGenres = resources.getStringArray(R.array.movie_genres)
        val movieBudgets = resources.getStringArray(R.array.movie_budgets)
        val movieRevenues = resources.getStringArray(R.array.movie_revenues)

        for((index,movie) in movieTitles.withIndex()){
            movies.add(
                Movie(
                    movieId = index,
                    movieTitle = movie,
                    moviePoster = moviePosters.getResourceId(index,0),
                    movieOverview = movieOverviews[index],
                    movieReleaseDate = movieReleaseDates[index],
                    movieLanguage = movieLanguages[index],
                    movieDuration = movieDurations[index],
                    movieGenres = movieGenres[index].split(';'),
                    movieBudget = currency.format(movieBudgets[index].toLong()),
                    movieRevenue = currency.format(movieRevenues[index].toLong())
                )
            )
        }

        moviePosters.recycle()
        return movies
    }

    fun getTvShowList(): List<TvShow> {
        val tvShows = mutableListOf<TvShow>()
        val tvShowPosters = resources.obtainTypedArray(R.array.tv_show_posters)
        val tvShowTitles = resources.getStringArray(R.array.tv_show_titles)
        val tvShowOverviews = resources.getStringArray(R.array.tv_show_overviews)
        val tvShowReleaseDates = resources.getStringArray(R.array.tv_show_release_dates)
        val tvShowLanguages = resources.getStringArray(R.array.tv_show_languages)
        val tvShowDurations = resources.getStringArray(R.array.tv_show_durations)
        val tvShowGenres = resources.getStringArray(R.array.tv_show_genres)
        val tvShowTypes = resources.getStringArray(R.array.tv_show_types)

        for((index,tvShow) in tvShowTitles.withIndex()){
            tvShows.add(
                TvShow(
                    tvShowId = index,
                    tvShowTitle = tvShow,
                    tvShowPoster = tvShowPosters.getResourceId(index,0),
                    tvShowOverview = tvShowOverviews[index],
                    tvShowReleaseDate = tvShowReleaseDates[index],
                    tvShowLanguage = tvShowLanguages[index],
                    tvShowDuration = tvShowDurations[index],
                    tvShowGenres = tvShowGenres[index].split(';'),
                    tvShowType = tvShowTypes[index]
                )
            )
        }
        tvShowPosters.recycle()
        return tvShows
    }

}