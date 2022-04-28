package com.skz.tmdbclient.data.repository.artist.datasource

import com.skz.tmdbclient.data.model.artist.Artist
import com.skz.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtists():Response<ArtistList>
}