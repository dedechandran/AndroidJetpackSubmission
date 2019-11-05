package com.example.androidjetpacksubmission.data.repositories.tvshow.remote

import com.google.gson.annotations.SerializedName

data class TvShowResponse(
    @SerializedName("page")
    var page: Int = 0,

    @SerializedName("total_results")
    var totalResult: Int = 0,

    @SerializedName("total_pages")
    var totalPages: Int = 0,

    @SerializedName("results")
    val data: List<TvShowData>
) {
    data class TvShowData(
        @SerializedName("id")
        var id: Int,

        @SerializedName("poster_path")
        var posterUrl: String,

        @SerializedName("original_language")
        var originalLanguage: String,

        @SerializedName("name")
        var title: String,

        @SerializedName("first_air_date")
        var firstAirDate : String,

        @SerializedName("overview")
        var overview: String
    )
}