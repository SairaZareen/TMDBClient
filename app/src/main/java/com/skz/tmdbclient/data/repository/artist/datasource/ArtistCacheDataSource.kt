package com.skz.tmdbclient.data.repository.artist.datasource

import com.skz.tmdbclient.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistFromCache():List<Artist>
    suspend fun saveArtistToCache(artists : List<Artist>)
}