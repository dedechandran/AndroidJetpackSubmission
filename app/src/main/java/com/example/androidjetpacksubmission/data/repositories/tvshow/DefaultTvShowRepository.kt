package com.example.androidjetpacksubmission.data.repositories.tvshow

import androidx.lifecycle.MutableLiveData
import com.example.androidjetpacksubmission.base.RepositoryCallback
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.mapper.TvShowMapper
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowRemoteDataSource
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowDetailResponse
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.response.TvShowResponse
import com.example.androidjetpacksubmission.domain.TvShow
import javax.inject.Inject

class DefaultTvShowRepository @Inject constructor(
    private val tvShowRemoteDataSource: TvShowRemoteDataSource,
    private val tvShowMapper: TvShowMapper
) : TvShowRepository {
    override
    fun getAll(): MutableLiveData<Resource<List<TvShow>>> {
        val tvShows = MutableLiveData<Resource<List<TvShow>>>()
        tvShows.postValue(Resource.loading())
        tvShowRemoteDataSource.loadTvShows(object : RepositoryCallback<TvShowResponse> {
            override fun onSuccess(data: TvShowResponse) {
                val mappedTvShows = tvShowMapper.transform(data)
                tvShows.postValue(Resource.success(mappedTvShows))
            }

            override fun onFailure(t: Throwable) {
                tvShows.postValue(Resource.error(t.message))
            }
        })
        return tvShows
    }

    override
    fun getDetail(id: Int): MutableLiveData<Resource<TvShow>> {
        val tvShow = MutableLiveData<Resource<TvShow>>()
        tvShow.postValue(Resource.loading())
        tvShowRemoteDataSource.loadTvShowDetail(
            id,
            object : RepositoryCallback<TvShowDetailResponse> {
                override fun onSuccess(data: TvShowDetailResponse) {
                    val mappedTvShow = tvShowMapper.transform(data)
                    tvShow.postValue(Resource.success(mappedTvShow))
                }

                override fun onFailure(t: Throwable) {
                    tvShow.postValue(Resource.error(t.message))
                }
            })
        return tvShow
    }
}