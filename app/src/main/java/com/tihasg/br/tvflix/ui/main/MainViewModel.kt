package com.tihasg.br.tvflix.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tihasg.br.tvflix.data.model.Movie
import com.tihasg.br.tvflix.data.repository.MovieRepository

class MainViewModel(private val repository: MovieRepository) : ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> get() = _movies

    fun fetchMovies() {
        _movies.value = repository.getMovies()
    }
}
