package com.example.androidjetpacksubmission.data.repositories.tvshow.remote

import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowDetailResponse
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowResponse
import com.example.androidjetpacksubmission.utils.EspressoIdlingResourceHelper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class DefaultTvShowRemoteDataSource @Inject constructor(private val tvShowService: TvShowService) :
    TvShowRemoteDataSource {
    override
    fun loadTvShows(callback: RepositoryCallback<TvShowResponse>) {
        EspressoIdlingResourceHelper.increment()
        tvShowService.getAllTvShow().enqueue(object : Callback<TvShowResponse> {
            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                callback.onFailure(t)
                EspressoIdlingResourceHelper.decrement()
            }

            override fun onResponse(
                call: Call<TvShowResponse>,
                response: Response<TvShowResponse>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { callback.onSuccess(it) }
                }
                EspressoIdlingResourceHelper.decrement()
            }
        })
    }

    override
    fun loadTvShowDetail(tvShowId: Int, callback: RepositoryCallback<TvShowDetailResponse>) {
        EspressoIdlingResourceHelper.increment()
        tvShowService.getTvShow(tvShowId).enqueue(object : Callback<TvShowDetailResponse> {
            override fun onFailure(call: Call<TvShowDetailResponse>, t: Throwable) {
                callback.onFailure(t)
                EspressoIdlingResourceHelper.decrement()
            }

            override fun onResponse(
                call: Call<TvShowDetailResponse>,
                response: Response<TvShowDetailResponse>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { callback.onSuccess(it) }
                }
                EspressoIdlingResourceHelper.decrement()
            }
        })
    }
}