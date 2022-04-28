package com.skz.tmdbclient.data.repository.movie.datasource

import com.skz.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies():Response<MovieList>
}