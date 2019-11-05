package com.example.androidjetpacksubmission.domain

data class TvShow(
    var tvShowId: Int,
    var tvShowTitle: String,
    var tvShowPoster: String,
    var tvShowOverview: String,
    var tvShowReleaseDate: String,
    var tvShowLanguage: String? = null,
    var tvShowDuration: String? = null,
    var tvShowGenres: List<String>? = null,
    var tvShowType: String? = null,
    var tvShowStatus: String? = null

)