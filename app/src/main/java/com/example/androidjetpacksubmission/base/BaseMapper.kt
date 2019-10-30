package com.example.androidjetpacksubmission.base

interface BaseMapper<I,O> {
    fun transform(data : I) : O
}