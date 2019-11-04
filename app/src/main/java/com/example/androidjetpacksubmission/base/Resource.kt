package com.example.androidjetpacksubmission.base

import com.example.androidjetpacksubmission.fixtures.StatusFixtures

data class Resource<out T>(
    val status: StatusFixtures,
    val data: T? = null,
    val message: String? = null
) {
    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(StatusFixtures.SUCCESS, data, null)
        }

        fun <T> loading(): Resource<T> {
            return Resource(StatusFixtures.LOADING, null, null)
        }

        fun <T> error(message: String?): Resource<T> {
            return Resource(StatusFixtures.ERROR, null, message)
        }
    }
}