package com.skz.tmdbclient.data.repository.movie.datasource

import com.skz.tmdbclient.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)

}