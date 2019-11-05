package com.example.androidjetpacksubmission.ui.home.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.tvshow.TvShowRepository
import com.example.androidjetpacksubmission.domain.TvShow
import javax.inject.Inject

class TvShowViewModel @Inject constructor(private val tvShowRepository: TvShowRepository) :
    ViewModel() {
    private var tvShows = MutableLiveData<Resource<List<TvShow>>>()
    private var tvShow = MutableLiveData<Resource<TvShow>>()

    fun getAllTvShows() : LiveData<Resource<List<TvShow>>>{
        if(tvShows.value != null){
            return tvShows
        }
        tvShows = tvShowRepository.getAllTvShows()
        return tvShows
    }

    fun getTvShowDetail(tvShowId : Int) : LiveData<Resource<TvShow>>{
        if(tvShow.value != null){
            return tvShow
        }
        tvShow = tvShowRepository.getTvShowDetail(tvShowId)
        return tvShow
    }
}