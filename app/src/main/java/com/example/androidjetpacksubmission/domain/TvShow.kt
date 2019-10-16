package com.example.androidjetpacksubmission.domain

data class TvShow(
    val tvShowId: Short,
    val tvShowName: String,
    val tvShowStatus: String,
    val tvShowHomePage: String,
    val tvShowOverview: String,
    val tvShowEpisodes: Short,
    val tvShowSeasons: Short,
    val tvShowPopularity: Double,
    val tvShowVoteAverage: Double,
    val tvShowPoster: Int,
    val tvShowReleaseDate: String,
    val tvShowCreators: List<String>,
    val tvShowGenres: List<String>,
    val tvShowProductionCompanies: List<String>
)