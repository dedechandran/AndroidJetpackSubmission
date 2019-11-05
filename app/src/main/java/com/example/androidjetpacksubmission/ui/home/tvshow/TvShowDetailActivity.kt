package com.example.androidjetpacksubmission.ui.home.tvshow

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseActivity
import com.example.androidjetpacksubmission.domain.TvShow
import com.example.androidjetpacksubmission.fixtures.EXTRA_TV_SHOW_ID
import com.example.androidjetpacksubmission.fixtures.IMAGE_URL
import com.example.androidjetpacksubmission.fixtures.StatusFixtures
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
        tvShowViewModel?.getTvShowDetail(tvShowId)?.observe(this, Observer {
            when (it.status) {
                StatusFixtures.LOADING -> shimmerTvShowDetailContainer.startShimmer()
                StatusFixtures.ERROR -> Toast.makeText(
                    this,
                    "ERROR GAYS",
                    Toast.LENGTH_SHORT
                ).show()
                StatusFixtures.SUCCESS -> {
                    if (it.data != null) {
                        shimmerTvShowDetailContainer.stopShimmer()
                        shimmerTvShowDetailContainer.visibility = View.GONE
                        showTvShowDetail(it.data)
                    }
                }
            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showTvShowDetail(tvShow: TvShow) {
        detailTextTvShowTitle.text = tvShow.tvShowTitle
        detailTextTvShowDate.text = tvShow.tvShowReleaseDate
        Glide.with(this)
            .load("$IMAGE_URL${tvShow.tvShowPoster}")
            .into(detailTvShowImage)

        detailTextTvShowDurationLabel.text = resources.getString(R.string.detail_duration_label)
        detailTextTvShowDuration.text = tvShow.tvShowDuration

        detailTextTvShowLanguageLabel.text = resources.getString(R.string.detail_language_label)
        detailTextTvShowLanguage.text = tvShow.tvShowLanguage

        detailTextTvShowTypeLabel.text = resources.getString(R.string.detail_type_label)
        detailTextTvShowType.text = tvShow.tvShowType

        detailTextTvShowStatusLabel.text = resources.getString(R.string.detail_status_label)
        detailTextTvShowStatus.text = tvShow.tvShowStatus

        detailTextTvShowOverviewLabel.text = resources.getString(R.string.detail_overview_label)
        detailTextTvShowOverview.text = tvShow.tvShowOverview

        detailTextTvShowGenreLabel.text = resources.getString(R.string.detail_genres_label)
        showGenres(tvShow.tvShowGenres!!)
    }

    private fun showGenres(genres: List<String>) {
        for (i in genres.indices) {
            val genreView = layoutInflater.inflate(
                R.layout.genre_item,
                detailTvShowGenresContainer
            ) as FlexboxLayout
            val genreText = genreView.getChildAt(i) as TextView
            genreText.text = genres[i]
        }
    }
}
