package com.example.androidjetpacksubmission.domain

data class Movie(
    val movieId: Int,
    val movieTitle: String,
    val moviePoster: Int,
    val movieOverview: String,
    val movieReleaseDate: String,
    val movieDuration: String,
    val movieGenres: List<String>,
    val movieLanguage: String,
    val movieBudget : String,
    val movieRevenue: String
)