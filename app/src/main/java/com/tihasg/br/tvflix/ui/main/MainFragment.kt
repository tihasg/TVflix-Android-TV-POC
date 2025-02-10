package com.tihasg.br.tvflix.ui.main

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter

class MainFragment : BrowseSupportFragment() {

    private val viewModel: MainViewModel by viewModels()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        title = "TVflix - Filmes"
        setupUI()
        observeMovies()
        viewModel.fetchMovies()
    }

    private fun setupUI() {
        brandColor = resources.getColor(android.R.color.holo_blue_dark, null)
    }

    private fun observeMovies() {
        viewModel.movies.observe(viewLifecycleOwner) { movies ->
            val rowsAdapter = ArrayObjectAdapter(ListRowPresenter())

            val listRowAdapter = ArrayObjectAdapter(MoviePresenter())
            movies.forEach { listRowAdapter.add(it) }

            val header = HeaderItem(0, "Populares")
            rowsAdapter.add(ListRow(header, listRowAdapter))

            adapter = rowsAdapter
        }
    }
}
