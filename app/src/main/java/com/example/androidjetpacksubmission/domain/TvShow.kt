package com.example.androidjetpacksubmission.domain

data class TvShow(
    val tvShowId: Int,
    val tvShowTitle: String,
    val tvShowPoster: Int,
    val tvShowOverview: String,
    val tvShowReleaseDate: String,
    val tvShowLanguage: String,
    val tvShowDuration: String,
    val tvShowGenres: List<String>,
    val tvShowType: String

)