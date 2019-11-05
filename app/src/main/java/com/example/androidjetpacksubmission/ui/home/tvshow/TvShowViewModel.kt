package com.example.androidjetpacksubmission.ui.home.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.base.Resource
import com.example.androidjetpacksubmission.data.repositories.tvshow.TvShowRepository
import com.example.androidjetpacksubmission.domain.TvShow
import com.example.androidjetpacksubmission.utils.DataHelper
import javax.inject.Inject

class TvShowViewModel constructor(private val tvShowRepository: TvShowRepository) :
    ViewModel() {
    private var tvShows = MutableLiveData<Resource<List<TvShow>>>()
    private var tvShow = MutableLiveData<Resource<TvShow>>()

    private fun tvShowTransformation(resource: Resource<TvShow>) : Resource<TvShow>{
        resource.data?.apply {
            tvShowDuration = DataHelper.convertDurationToHoursAndMinute(tvShowDuration?.toInt()!!)
            tvShowLanguage = DataHelper.convertLanguageCode(tvShowLanguage!!)
        }

        return Resource(resource.status,resource.data,resource.message)
    }

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
        return Transformations.map(tvShow,::tvShowTransformation)
    }
}