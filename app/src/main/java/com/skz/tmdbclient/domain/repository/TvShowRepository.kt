package com.skz.tmdbclient.domain.repository

import com.skz.tmdbclient.data.model.tvshow.TvShow

interface TvShowRepository {

    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}