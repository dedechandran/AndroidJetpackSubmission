package com.example.androidjetpacksubmission.domain

data class TvShow(
    val tvShowId: Short,
    val tvShowTitle: String,
    val tvShowPoster: Int,
    val tvShowOverview: String,
    val tvShowReleaseDate: String,
    val tvShowDuration: String,
    val tvShowGenres: List<String>,
    val tvShowLanguage: String
)