package com.skz.tmdbclient.data.repository.tvshow.datasourceImpl

import com.skz.tmdbclient.data.model.tvshow.TvShow
import com.skz.tmdbclient.data.repository.tvshow.datasource.TvShowCacheDataSource
import java.util.*

class TvShowCacheDataSourceImpl : TvShowCacheDataSource {

    private var tvShowLList = ArrayList<TvShow>()

    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowLList
    }

    override suspend fun saveTvShowToCache(tvShow: List<TvShow>) {
        tvShowLList.clear()
        tvShowLList = ArrayList(tvShow)
    }
}