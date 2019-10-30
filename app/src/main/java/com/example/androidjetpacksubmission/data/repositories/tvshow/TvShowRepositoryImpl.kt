package com.example.androidjetpacksubmission.data.repositories.tvshow

import androidx.lifecycle.LiveData
import com.example.androidjetpacksubmission.data.repositories.tvshow.remote.TvShowResponse

import javax.inject.Inject

class TvShowRepositoryImpl @Inject constructor() :
    TvShowRepository {
    override suspend fun getAll(): LiveData<List<TvShowResponse>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getById(id: String): LiveData<TvShowResponse> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}