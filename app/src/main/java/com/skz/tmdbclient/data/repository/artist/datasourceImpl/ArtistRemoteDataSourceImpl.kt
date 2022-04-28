package com.skz.tmdbclient.data.repository.artist.datasourceImpl

import com.skz.tmdbclient.data.api.TMDBService
import com.skz.tmdbclient.data.model.artist.Artist
import com.skz.tmdbclient.data.model.artist.ArtistList
import com.skz.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(private val tmdbService : TMDBService, private val apiKey: String) : ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> = tmdbService.getPopularArtists(apiKey)
}