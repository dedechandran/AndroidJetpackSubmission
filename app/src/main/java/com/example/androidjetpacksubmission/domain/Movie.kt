package com.example.androidjetpacksubmission.domain

data class Movie(
    val movieId: Short,
    val movieTitle: String,
    val movieOverview: String,
    val movieReleaseDate: String,
    val movieHomePage: String,
    val movieStatus: String,
    val moviePopularity: Double,
    val movieVoteAverage: Double,
    val movieVoteCount: Short,
    val movieDuration: Short,
    val moviePoster: Int,
    val movieGenres: List<String>,
    val movieLanguages: List<String>,
    val movieProductionCountries: List<String>,
    val movieProductionCompanies: List<String>
)