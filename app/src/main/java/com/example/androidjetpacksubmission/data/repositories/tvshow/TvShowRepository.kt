package com.example.androidjetpacksubmission.data.repositories.tvshow

import androidx.lifecycle.MutableLiveData
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowRemoteDataSource
import com.example.androidjetpacksubmission.domain.TvShow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TvShowRepository @Inject constructor(private val tvShowRemoteDataSource: TvShowRemoteDataSource) {

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
}