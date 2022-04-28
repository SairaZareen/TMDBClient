package com.skz.tmdbclient.domain.usecase

import com.skz.tmdbclient.data.model.tvshow.TvShow
import com.skz.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowUseCase(private val tvShowRepository : TvShowRepository) {

    suspend fun execute():List<TvShow>? = tvShowRepository.updateTvShows()
}