package com.example.androidjetpacksubmission.utils

import android.content.res.Resources
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.domain.Movie
import com.example.androidjetpacksubmission.domain.TvShow
import javax.inject.Inject

class DummyData @Inject constructor(private val resources: Resources) {
    fun getMovieList(): List<Movie> {
        val movies = mutableListOf<Movie>()
        val movieTitles = resources.getStringArray(R.array.movie_titles)
        val moviePosters = resources.obtainTypedArray(R.array.movie_posters)
        val movieOverviews = resources.getStringArray(R.array.movie_overviews)
        val movieReleaseDates = resources.getStringArray(R.array.movie_release_date)
        for (i in movieTitles.indices) {
            movies.add(
                Movie(
                    movieId = i.toShort(),
                    movieTitle = movieTitles[i],
                    moviePoster = moviePosters.getResourceId(i, 0),
                    movieOverview = movieOverviews[i],
                    movieDuration = 0,
                    movieGenres = listOf(),
                    movieHomePage = "",
                    movieLanguages = listOf(),
                    moviePopularity = 0.0,
                    movieProductionCompanies = listOf(),
                    movieProductionCountries = listOf(),
                    movieReleaseDate = movieReleaseDates[i],
                    movieStatus = "",
                    movieVoteAverage = 0.0,
                    movieVoteCount = 0
                )
            )
        }
        moviePosters.recycle()
        return movies
    }

    fun getTvShowList() : List<TvShow>{
        val tvShows = mutableListOf<TvShow>()
        val tvShowName = resources.getStringArray(R.array.tv_show_name)
        val tvShowPosters = resources.obtainTypedArray(R.array.tv_show_posters)
        val tvShowOverviews = resources.getStringArray(R.array.tv_show_overviews)
        val tvShowReleaseDates = resources.getStringArray(R.array.tv_show_release_date)
        for (i in tvShowName.indices) {
            tvShows.add(
                TvShow(
                    tvShowId = i.toShort(),
                    tvShowName = tvShowName[i],
                    tvShowPoster = tvShowPosters.getResourceId(i, 0),
                    tvShowOverview = tvShowOverviews[i],
                    tvShowReleaseDate = tvShowReleaseDates[i],
                    tvShowGenres = listOf(),
                    tvShowHomePage = "",
                    tvShowCreators = listOf(),
                    tvShowEpisodes = 0,
                    tvShowPopularity = 0.0,
                    tvShowProductionCompanies = listOf(),
                    tvShowSeasons = 0,
                    tvShowStatus = "",
                    tvShowVoteAverage = 0.0
                )
            )
        }
        tvShowPosters.recycle()
        return tvShows
    }

}