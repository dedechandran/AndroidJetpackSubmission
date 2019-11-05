package com.example.androidjetpacksubmission.domain

data class TvShow(
    val tvShowId: Int,
    val tvShowTitle: String,
    val tvShowPoster: String,
    val tvShowOverview: String,
    val tvShowReleaseDate: String,
    val tvShowLanguage: String? = null,
    val tvShowDuration: Int? = null,
    val tvShowGenres: List<String>? = null,
    val tvShowType: String? = null,
    val tvShowStatus: String? = null

)