package com.example.androidjetpacksubmission.data.repositories.movie.remote

import com.google.gson.annotations.SerializedName

class MovieResponse {
    @SerializedName("page")
    var page: Int = 0

    @SerializedName("total_results")
    var totalResult: Int = 0

    @SerializedName("total_pages")
    var totalPages: Int = 0

    @SerializedName("results")
    val data: List<MovieData> = mutableListOf()

    data class MovieData(
        @SerializedName("id")
        var id: Int,

        @SerializedName(value = "poster_path",alternate = ["backdrop_path"])
        var posterUrl : String,

        @SerializedName("original_language")
        var originalLanguage: String,

        @SerializedName("original_title")
        var originalTitle: String,

        @SerializedName("release_date")
        var releaseDate: String
        )

}