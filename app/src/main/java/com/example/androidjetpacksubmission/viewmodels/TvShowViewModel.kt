package com.example.androidjetpacksubmission.viewmodels

import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.domain.TvShow
import com.example.androidjetpacksubmission.utils.DummyData

class TvShowViewModel constructor(dummyData: DummyData) : ViewModel() {
    private val tvShows = mutableListOf<TvShow>()
    init {
        tvShows.addAll(dummyData.getTvShowList())
    }

    fun loadTvShows() = tvShows

    fun getTvShowDetail(tvShowId : Short) = tvShows[tvShowId.toInt() - 1]
}