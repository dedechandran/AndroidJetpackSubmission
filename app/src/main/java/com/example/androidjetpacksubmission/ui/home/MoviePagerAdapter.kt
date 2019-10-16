package com.example.androidjetpacksubmission.ui.home

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.androidjetpacksubmission.fixtures.*
import com.example.androidjetpacksubmission.ui.home.fragments.movie.MovieFragment
import com.example.androidjetpacksubmission.ui.home.fragments.tvshow.TvShowFragment

class MoviePagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int) = when (position) {
        MOVIE_INDEX -> MovieFragment()
        TV_SHOW_INDEX -> TvShowFragment()
        else -> MovieFragment()
    }

    override fun getCount() = TAB_COUNT

    override fun getPageTitle(position: Int) = when (position) {
        MOVIE_INDEX -> MOVIE_TAB_TITLE
        TV_SHOW_INDEX -> TV_SHOW_TAB_TITLE
        else -> super.getPageTitle(position)
    }
}