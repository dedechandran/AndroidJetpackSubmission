package com.example.androidjetpacksubmission.data.repositories.tvshow.remote

import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowDetailResponse
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowResponse

interface TvShowRemoteDataSource {
    fun loadTvShows(callback: RepositoryCallback<TvShowResponse>)
    fun loadTvShowDetail(tvShowId: Int, callback: RepositoryCallback<TvShowDetailResponse>)

}