package com.tihasg.br.tvflix.di

import com.tihasg.br.tvflix.data.repository.MovieRepository
import com.tihasg.br.tvflix.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val coreModule = module {
   single { MovieRepository() }
   viewModel { MainViewModel(get()) }
}