package com.example.androidjetpacksubmission.domain

data class Movie(
    val movieId: Int,
    val movieTitle: String,
    val moviePoster: String,
    val movieOverview: String,
    val movieReleaseDate: String,
    var movieDuration: Int? = null,
    var movieGenres: List<String>? = null,
    var movieLanguage: String? = null,
    var movieBudget : Long? = null,
    var movieRevenue: Long? = null
)