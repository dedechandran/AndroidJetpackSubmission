package com.example.androidjetpacksubmission.ui.home.tvshow


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidjetpacksubmission.R
import com.example.androidjetpacksubmission.base.BaseFragment
import com.example.androidjetpacksubmission.fixtures.EXTRA_TV_SHOW_ID
import com.example.androidjetpacksubmission.fixtures.StatusFixtures
import kotlinx.android.synthetic.main.fragment_tv_show.*
import javax.inject.Inject


class TvShowFragment : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private var tvShowViewModel: TvShowViewModel? = null
    private lateinit var tvShowAdapter: TvShowAdapter

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        tvShowAdapter = TvShowAdapter {
            Intent(context, TvShowDetailActivity::class.java).run {
                putExtra(EXTRA_TV_SHOW_ID, it.tvShowId)
                startActivity(this)
            }
        }

        tvShowRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = tvShowAdapter
        }

        tvShowViewModel = activity?.run {
            ViewModelProviders.of(this, viewModelFactory)[TvShowViewModel::class.java]
        }

        tvShowViewModel?.getAllTvShows()?.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                StatusFixtures.LOADING -> shimmerTvShowContainer.startShimmer()
                StatusFixtures.ERROR -> Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
                StatusFixtures.SUCCESS -> {
                    shimmerTvShowContainer.stopShimmer()
                    shimmerTvShowContainer.visibility = View.GONE
                    tvShowAdapter.setData(it.data)
                }
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }


}
