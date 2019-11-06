package com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response

import com.google.gson.annotations.SerializedName

data class TvShowDetailResponse(
    @SerializedName("id")
    var id: Int,

    @SerializedName("poster_path")
    var posterUrl: String,

    @SerializedName("original_language")
    var originalLanguage: String,

    @SerializedName("name")
    var title: String,

    @SerializedName("first_air_date")
    var firstAirDate: String,

    @SerializedName("overview")
    var overview: String,

    @SerializedName("genres")
    val genres: List<Genre>,

    @SerializedName("status")
    val status: String,

    @SerializedName("type")
    val type: String,

    @SerializedName("episode_run_time")
    val duration: List<Int>
) {
    data class Genre(
        @SerializedName("id")
        val id: Int,

        @SerializedName("name")
        val name: String
    )
}