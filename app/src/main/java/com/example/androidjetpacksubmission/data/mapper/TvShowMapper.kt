package com.example.androidjetpacksubmission.data.mapper

import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowDetailResponse
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowResponse
import com.example.androidjetpacksubmission.domain.TvShow
import javax.inject.Inject

class TvShowMapper @Inject constructor() {
    fun transform(tvShowResponse: TvShowResponse): List<TvShow> {
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

    fun transform(tvShowDetailResponse: TvShowDetailResponse): TvShow =
        TvShow(
            tvShowId = tvShowDetailResponse.id,
            tvShowTitle = tvShowDetailResponse.title,
            tvShowReleaseDate = tvShowDetailResponse.firstAirDate,
            tvShowOverview = tvShowDetailResponse.overview,
            tvShowPoster = tvShowDetailResponse.posterUrl,
            tvShowStatus = tvShowDetailResponse.status,
            tvShowType = tvShowDetailResponse.type,
            tvShowGenres = tvShowDetailResponse.genres.map {
                it.name
            },
            tvShowLanguage = tvShowDetailResponse.originalLanguage,
            tvShowDuration = tvShowDetailResponse.duration[0].toString()
        )
}