package com.skz.tmdbclient.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.skz.tmdbclient.domain.usecase.GetMoviesUseCase
import com.skz.tmdbclient.domain.usecase.UpdateMoviesUseCase
import dagger.Provides

class MovieViewModelFactory(
    private val getMoviesUseCase : GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) :ViewModelProvider.Factory{
    @SuppressWarnings("unchecked")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUseCase) as T
    }

}