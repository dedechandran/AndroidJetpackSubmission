package com.example.androidjetpacksubmission.data.repositories.tvshow

import androidx.lifecycle.MutableLiveData
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowRemoteDataSource
import com.example.androidjetpacksubmission.domain.TvShow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class TvShowRepository @Inject constructor(private val tvShowRemoteDataSource: TvShowRemoteDataSource) {

    fun getAllTvShows(): MutableLiveData<Resource<List<TvShow>>> {
        val tvShows = MutableLiveData<Resource<List<TvShow>>>()
        tvShows.postValue(Resource.loading())
        tvShowRemoteDataSource.loadTvShows(object : RepositoryCallback<List<TvShow>> {
            override fun onSuccess(data: List<TvShow>) {
                tvShows.postValue(Resource.success(data))
            }

            override fun onFailure(t: Throwable) {
                tvShows.postValue(Resource.error(t.message))
            }
        })
        return tvShows
    }

    fun getTvShowDetail(tvShowId : Int) : MutableLiveData<Resource<TvShow>>{
        val tvShow = MutableLiveData<Resource<TvShow>>()
        tvShow.postValue(Resource.loading())
        tvShowRemoteDataSource.loadTvShowDetail(tvShowId, object : RepositoryCallback<TvShow>{
            override fun onSuccess(data: TvShow) {
                tvShow.postValue(Resource.success(data))
            }

            override fun onFailure(t: Throwable) {
                tvShow.postValue(Resource.error(t.message))
            }
        })
        return tvShow
    }
}