package com.example.androidjetpacksubmission.domain

data class Movie(
    val movieId: Int,
    val movieTitle: String,
    val moviePoster: String,
    val movieOverview: String,
    val movieReleaseDate: String,
    var movieDuration: String? = null,
    var movieGenres: List<String>? = null,
    var movieLanguage: String? = null,
    var movieBudget : String? = null,
    var movieRevenue: String? = null
)