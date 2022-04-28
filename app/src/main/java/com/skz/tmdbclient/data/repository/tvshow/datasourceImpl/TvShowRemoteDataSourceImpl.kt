package com.skz.tmdbclient.data.repository.tvshow.datasourceImpl

import com.skz.tmdbclient.data.api.TMDBService
import com.skz.tmdbclient.data.model.movie.MovieList
import com.skz.tmdbclient.data.model.tvshow.TvShow
import com.skz.tmdbclient.data.model.tvshow.TvShowList
import com.skz.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(private val tmdbService : TMDBService, private val apiKey: String) : TvShowRemoteDataSource {

    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}