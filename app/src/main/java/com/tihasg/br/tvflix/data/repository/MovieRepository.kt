package com.tihasg.br.tvflix.data.repository

import com.tihasg.br.tvflix.data.model.Movie

class MovieRepository {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie(
                id = 1,
                title = "Filme 1",
                description = "Descrição do Filme 1",
                imageUrl = "https://via.placeholder.com/300",
                videoUrl = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4"
            ),
            Movie(
                id = 2,
                title = "Filme 2",
                description = "Descrição do Filme 2",
                imageUrl = "https://via.placeholder.com/300",
                videoUrl = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4"
            )
        )
    }
}
