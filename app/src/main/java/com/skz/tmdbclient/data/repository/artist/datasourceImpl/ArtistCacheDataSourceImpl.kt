package com.skz.tmdbclient.data.repository.artist.datasourceImpl

import com.skz.tmdbclient.data.model.artist.Artist
import com.skz.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import java.util.*

class ArtistCacheDataSourceImpl : ArtistCacheDataSource{

    private var artistList = ArrayList<Artist>()

    override suspend fun getArtistFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistToCache(artists: List<Artist>) {
        artistList.clear()
        artistList = ArrayList(artists)
    }

}