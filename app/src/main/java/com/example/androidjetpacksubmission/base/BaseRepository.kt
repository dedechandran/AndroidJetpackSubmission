package com.example.androidjetpacksubmission.base

import androidx.lifecycle.MutableLiveData

interface BaseRepository<T> {
    fun getAll() : MutableLiveData<Resource<List<T>>>
    fun getDetail(id : Int) : MutableLiveData<Resource<T>>
}