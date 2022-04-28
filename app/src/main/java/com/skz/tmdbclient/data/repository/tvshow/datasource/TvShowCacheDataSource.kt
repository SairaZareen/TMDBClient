package com.skz.tmdbclient.data.repository.tvshow.datasource

import com.skz.tmdbclient.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowToCache(tvShow : List<TvShow>)
}