package com.example.androidjetpacksubmission.ui.home.fragments.tvshow


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseFragment
import com.example.androidjetpacksubmission.fixtures.EXTRA_TV_SHOW_ID
import com.example.androidjetpacksubmission.ui.TvShowDetailActivity
import com.example.androidjetpacksubmission.viewmodels.MovieViewModel
import com.example.androidjetpacksubmission.viewmodels.TvShowViewModel
import kotlinx.android.synthetic.main.fragment_tv_show.view.*
import javax.inject.Inject


class TvShowFragment : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var tvShowViewModel: TvShowViewModel? = null
    private lateinit var tvShowAdapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tv_show, container, false)
        tvShowAdapter = TvShowAdapter{
            Intent(context,TvShowDetailActivity::class.java).run {
                putExtra(EXTRA_TV_SHOW_ID,it.tvShowId)
                startActivity(this)
            }
        }

        view.tvShowRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = tvShowAdapter
        }

        tvShowViewModel = activity?.run {
            ViewModelProviders.of(this,viewModelFactory)[TvShowViewModel::class.java]
        }
        tvShowAdapter.setData(tvShowViewModel?.loadTvShows())
        return view
    }


}
