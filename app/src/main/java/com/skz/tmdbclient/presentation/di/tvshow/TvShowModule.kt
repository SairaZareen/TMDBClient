package com.skz.tmdbclient.presentation.di.tvshow

import com.skz.tmdbclient.domain.usecase.GetTvShowUseCase
import com.skz.tmdbclient.domain.usecase.UpdateTvShowUseCase
import com.skz.tmdbclient.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowUseCase: GetTvShowUseCase,
        updateTvShowUseCase: UpdateTvShowUseCase
    ):TvShowViewModelFactory{
        return TvShowViewModelFactory(getTvShowUseCase,updateTvShowUseCase)
    }
}