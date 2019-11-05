package com.example.androidjetpacksubmission.data.repositories.tvshow.remote

import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.data.mapper.TvShowMapper
import com.example.androidjetpacksubmission.domain.TvShow
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TvShowRemoteDataSource @Inject constructor(
    private val tvShowService: TvShowService,
    private val tvShowMapper: TvShowMapper
) {

    fun loadTvShows(callback: RepositoryCallback<List<TvShow>>) {
        tvShowService.getAllTvShow().enqueue(object : Callback<TvShowResponse> {
            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                callback.onFailure(t)
            }

            override fun onResponse(
                call: Call<TvShowResponse>,
                response: Response<TvShowResponse>
            ) {
                val tvShows = tvShowMapper.transform(response.body()!!)
                callback.onSuccess(tvShows)
            }
        })
    }

    fun loadTvShowDetail(tvShowId : Int, callback: RepositoryCallback<TvShow>){
        tvShowService.getTvShow(tvShowId).enqueue(object : Callback<TvShowDetailResponse>{
            override fun onFailure(call: Call<TvShowDetailResponse>, t: Throwable) {
                callback.onFailure(t)
            }

            override fun onResponse(
                call: Call<TvShowDetailResponse>,
                response: Response<TvShowDetailResponse>
            ) {
                val tvShow = tvShowMapper.transform(response.body()!!)
                callback.onSuccess(tvShow)
            }
        })
    }

}