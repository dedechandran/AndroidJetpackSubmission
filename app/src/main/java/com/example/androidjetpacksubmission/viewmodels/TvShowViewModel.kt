package com.example.androidjetpacksubmission.viewmodels

import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.domain.TvShow
import com.example.androidjetpacksubmission.utils.DummyData

class TvShowViewModel constructor(private val dummyData: DummyData) : ViewModel() {

    fun loadTvShows() : List<TvShow> = dummyData.getTvShowList()

    fun getTvShowDetail(tvShowId : Int) : TvShow = dummyData.getTvShowList()[tvShowId]
}