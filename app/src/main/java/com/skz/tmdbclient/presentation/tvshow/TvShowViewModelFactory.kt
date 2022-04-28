package com.skz.tmdbclient.presentation.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.skz.tmdbclient.domain.usecase.GetTvShowUseCase
import com.skz.tmdbclient.domain.usecase.UpdateTvShowUseCase

class TvShowViewModelFactory(private val getTvShowUseCase: GetTvShowUseCase,
                             private val updateTvShowUseCase: UpdateTvShowUseCase
) : ViewModelProvider.Factory {
    @SuppressWarnings("unchecked")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TvShowViewModel(getTvShowUseCase,updateTvShowUseCase) as T
    }
}