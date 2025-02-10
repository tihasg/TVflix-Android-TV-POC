package com.tihasg.br.tvflix.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.leanback.widget.Presenter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.tvflix.R
import com.example.tvflix.data.model.Movie
import com.tihasg.br.tvflix.R
import com.tihasg.br.tvflix.data.model.Movie

class MoviePresenter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, item: Any) {
        val movie = item as Movie
        val imageView = viewHolder.view.findViewById<ImageView>(R.id.movie_image)
        val titleView = viewHolder.view.findViewById<TextView>(R.id.movie_title)

        titleView.text = movie.title
        Glide.with(viewHolder.view.context)
            .load(movie.imageUrl)
            .into(imageView)
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder) {}
}
