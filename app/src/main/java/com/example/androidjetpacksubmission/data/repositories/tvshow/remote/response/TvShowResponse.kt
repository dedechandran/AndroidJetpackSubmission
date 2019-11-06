package com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response

import com.google.gson.annotations.SerializedName

data class TvShowResponse(
    @SerializedName("results")
    val data: List<TvShowData>
) {
    data class TvShowData(
        @SerializedName("id")
        var id: Int,

        @SerializedName("poster_path")
        var posterUrl: String,

        @SerializedName("name")
        var title: String,

        @SerializedName("first_air_date")
        var firstAirDate : String,

        @SerializedName("overview")
        var overview: String
    )
}