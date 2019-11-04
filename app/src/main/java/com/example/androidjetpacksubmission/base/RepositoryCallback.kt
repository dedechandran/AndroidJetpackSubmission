package com.example.androidjetpacksubmission.base

interface RepositoryCallback<T> {
    fun onSuccess(data : T)
    fun onFailure(t : Throwable)
}