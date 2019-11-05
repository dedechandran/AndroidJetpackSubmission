package com.example.androidjetpacksubmission.data.mapper

import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowResponse
import com.example.androidjetpacksubmission.domain.TvShow
import javax.inject.Inject

class TvShowMapper @Inject constructor(){
    fun transform(tvShowResponse: TvShowResponse) : List<TvShow>{
        val tvShows = mutableListOf<TvShow>()
        tvShowResponse.data.map {
            tvShows.add(
                TvShow(
                    tvShowId = it.id,
                    tvShowTitle = it.title,
                    tvShowReleaseDate = it.firstAirDate,
                    tvShowOverview = it.overview,
                    tvShowPoster = it.posterUrl
                )
            )
        }
        return tvShows
    }
}