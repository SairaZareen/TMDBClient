package com.skz.tmdbclient.data.repository.tvshow.datasource

import com.skz.tmdbclient.data.model.tvshow.TvShow
import com.skz.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {
    suspend fun getTvShows() : Response<TvShowList>
}