package com.example.androidjetpacksubmission.ui.home.movie

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.fixtures.EXTRA_MOVIE_ID
import com.example.androidjetpacksubmission.utils.EspressoIdlingResourceHelper
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MovieDetailActivityTest {
    private val fakeMovieId = 475557

    @Rule
    @JvmField
    val activityRule =
        object : ActivityTestRule<MovieDetailActivity>(MovieDetailActivity::class.java) {
            override fun getActivityIntent(): Intent {
                val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
                val result = Intent(targetContext, MovieDetailActivity::class.java)
                result.putExtra(EXTRA_MOVIE_ID, fakeMovieId)
                return result
            }
        }

    @Before
    fun setUp() {
        IdlingRegistry.getInstance()
            .register(EspressoIdlingResourceHelper.getEspressoIdlingResource())
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance()
            .unregister(EspressoIdlingResourceHelper.getEspressoIdlingResource())
    }

    @Test
    fun loadMovieDetail() {
        onView(ViewMatchers.withId(R.id.detailTextMovieTitle))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextMovieTitle))
            .check(ViewAssertions.matches(ViewMatchers.withText("Joker")))

        onView(ViewMatchers.withId(R.id.detailTextMovieDate))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextMovieDate))
            .check(ViewAssertions.matches(ViewMatchers.withText("2019-10-02")))

        onView(ViewMatchers.withId(R.id.detailTextMovieDurationLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextMovieDuration))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))


        onView(ViewMatchers.withId(R.id.detailTextMovieLanguageLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextMovieLanguage))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextMovieLanguage))
            .check(ViewAssertions.matches(ViewMatchers.withText("English")))

        onView(ViewMatchers.withId(R.id.detailTextMovieBudgetLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextMovieBudget))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(ViewMatchers.withId(R.id.detailTextMovieRevenueLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextMovieRevenue))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(ViewMatchers.withId(R.id.detailTextMovieGenreLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailMovieGenresContainer))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(ViewMatchers.withId(R.id.detailTextMovieOverviewLabel))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(ViewMatchers.withId(R.id.detailTextMovieOverview))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}