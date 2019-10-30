package com.example.androidjetpacksubmission.base

import androidx.lifecycle.LiveData

interface BaseRepository<T> {
    suspend fun getAll() : LiveData<List<T>>
    suspend fun getById(id: String): LiveData<T>
}