package com.skz.tmdbclient.data.repository.tvshow.datasourceImpl

import com.skz.tmdbclient.data.db.MovieDao
import com.skz.tmdbclient.data.db.TvShowDao
import com.skz.tmdbclient.data.model.tvshow.TvShow
import com.skz.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TvShowLocalDataSourceImpl(private val tvShowDao : TvShowDao) : TvShowLocalDataSource {
    override suspend fun getTvShowsFromDB(): List<TvShow> {
        return tvShowDao.getTvShows()
    }

    override suspend fun saveTvShowsToDB(tvShows: List<TvShow>) {
        CoroutineScope(Dispatchers.IO).launch {
            tvShowDao.saveTvShows(tvShows)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           tvShowDao.deleteAllTvShows()
       }
    }
}