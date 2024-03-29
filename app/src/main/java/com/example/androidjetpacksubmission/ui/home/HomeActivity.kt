package com.example.androidjetpacksubmission.ui.home

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.androidjetpacksubmission.viewmodels.MovieViewModel
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*
import javax.inject.Inject

class HomeActivity : BaseActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var movieViewModel : MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        mainViewPager.adapter =
            MoviePagerAdapter(supportFragmentManager)
        mainTabMovie.setupWithViewPager(mainViewPager)
        movieViewModel = ViewModelProviders.of(this,viewModelFactory).get(MovieViewModel::class.java)
        Log.d("MAINACTIVITY",movieViewModel.loadMovies().toString())
    }
}
