package com.example.androidjetpacksubmission.utils

import androidx.test.espresso.IdlingResource
import androidx.test.espresso.idling.CountingIdlingResource

class EspressoIdlingResourceHelper {
    companion object {
        private const val resource = "GLOBAL"
        private val espressoTestIdlingResource = CountingIdlingResource(resource)

        fun increment() {
            espressoTestIdlingResource.increment()
        }

        fun decrement() {
            espressoTestIdlingResource.decrement()
        }

        fun getEspressoIdlingResource(): IdlingResource = espressoTestIdlingResource
    }
}