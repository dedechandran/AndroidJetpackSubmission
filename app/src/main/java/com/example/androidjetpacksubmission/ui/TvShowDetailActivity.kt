package com.example.androidjetpacksubmission.ui

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity
import com.example.androidjetpacksubmission.fixtures.EXTRA_TV_SHOW_ID
import com.example.androidjetpacksubmission.viewmodels.TvShowViewModel
import com.google.android.flexbox.FlexboxLayout
import kotlinx.android.synthetic.main.activity_tv_show_detail.*
import javax.inject.Inject

class TvShowDetailActivity : BaseActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var tvShowViewModel: TvShowViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_show_detail)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = resources.getString(R.string.tv_show_detail_title)
        }

        tvShowViewModel = ViewModelProviders.of(this, viewModelFactory)[TvShowViewModel::class.java]

        val tvShowId = intent.getIntExtra(EXTRA_TV_SHOW_ID, 0)
        showTvShowDetail(tvShowId)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showTvShowDetail(tvShowId: Int) {
        val tvShow = tvShowViewModel?.getTvShowDetail(tvShowId)

        detailTextTvShowTitle.text = tvShow?.tvShowTitle
        detailTextTvShowDate.text = tvShow?.tvShowReleaseDate
        Glide.with(this)
            .load(tvShow?.tvShowPoster)
            .into(detailTvShowImage)
        detailTextTvShowOverview.text = tvShow?.tvShowOverview
        detailTextTvShowDuration.text = tvShow?.tvShowDuration
        detailTextTvShowLanguage.text = tvShow?.tvShowLanguage
        detailTextTvShowType.text = tvShow?.tvShowType
        detailTextTvShowStatus.text = "-"
        showGenres(tvShow?.tvShowGenres!!)

    }

    private fun showGenres(genres: List<String>){
        for(i in genres.indices){
            val genreView = layoutInflater.inflate(R.layout.genre_item,detailTvShowGenresContainer) as FlexboxLayout
            val genreText = genreView.getChildAt(i) as TextView
            genreText.text = genres[i]
        }
    }
}
