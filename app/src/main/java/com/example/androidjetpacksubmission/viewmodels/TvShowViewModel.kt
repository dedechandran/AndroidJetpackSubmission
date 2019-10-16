package com.example.androidjetpacksubmission.viewmodels

import androidx.lifecycle.ViewModel
import com.example.androidjetpacksubmission.domain.TvShow
import com.example.androidjetpacksubmission.utils.DummyData
import javax.inject.Inject

class TvShowViewModel constructor(dummyData: DummyData) : ViewModel() {
    private val tvShows = mutableListOf<TvShow>()
    init {
        tvShows.addAll(dummyData.getTvShowList())
    }

    fun loadTvShows() = tvShows
}