package com.example.androidjetpacksubmission.ui.home

import android.os.Bundle
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        mainViewPager.adapter =
            HomePagerAdapter(supportFragmentManager)
        mainTabMovie.setupWithViewPager(mainViewPager)

    }
}
