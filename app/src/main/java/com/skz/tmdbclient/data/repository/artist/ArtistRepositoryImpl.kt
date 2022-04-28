package com.skz.tmdbclient.data.repository.artist

import android.util.Log
import com.skz.tmdbclient.data.model.artist.Artist
import com.skz.tmdbclient.data.model.movie.Movie
import com.skz.tmdbclient.data.repository.artist.datasource.ArtistCacheDataSource
import com.skz.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.skz.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.skz.tmdbclient.domain.repository.ArtistRepository

class ArtistRepositoryImpl(
    private val artistRemoteDataSource: ArtistRemoteDataSource,
    private val artistLocalDataSource: ArtistLocalDataSource,
    private val artistCacheDataSource: ArtistCacheDataSource
) : ArtistRepository {
    override suspend fun getArtists(): List<Artist>? {
        return getArtistsFromCache()
    }

    override suspend fun updateArtists(): List<Artist>? {
        val newListOfArtists = getArtistsFromAPI()
        artistLocalDataSource.clearAll()
        artistLocalDataSource.saveArtistToDB(newListOfArtists)
        artistCacheDataSource.saveArtistToCache(newListOfArtists)
        return newListOfArtists
    }

    suspend fun getArtistsFromAPI():List<Artist>{
        lateinit var artistList : List<Artist>
        try {
            val response = artistRemoteDataSource.getArtists()
            val body = response.body()
            if (body!= null){
                artistList = body.artists
            }
        }catch (exception: Exception){
            Log.i("MyTag",exception.message.toString() )
        }
        return artistList
    }

    suspend fun getArtistsFromDB():List<Artist> {
        lateinit var artistList: List<Artist>
        try {
            artistList = artistLocalDataSource.getArtistFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (artistList.size > 0) {
            return artistList
        } else {
            artistList = getArtistsFromAPI()
            artistLocalDataSource.saveArtistToDB(artistList)
        }
        return artistList
    }

    suspend fun getArtistsFromCache():List<Artist>{
        lateinit var artistList : List<Artist>
        try {
            artistList = artistCacheDataSource.getArtistFromCache()
        }catch (exception: Exception){
            Log.i("MyTag",exception.message.toString() )
        }
        if (artistList.size>0){
            return artistList
        }
        else{
            artistList = getArtistsFromDB()
            artistCacheDataSource.saveArtistToCache(artistList)
        }
        return artistList
    }
}