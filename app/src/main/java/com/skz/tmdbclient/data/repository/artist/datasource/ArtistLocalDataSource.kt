package com.skz.tmdbclient.data.repository.artist.datasource

import com.skz.tmdbclient.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistFromDB():List<Artist>
    suspend fun saveArtistToDB(artists : List<Artist>)
    suspend fun clearAll()
}