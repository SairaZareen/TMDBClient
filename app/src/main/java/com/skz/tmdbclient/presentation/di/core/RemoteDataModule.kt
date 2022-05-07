package com.skz.tmdbclient.presentation.di.core

import com.skz.tmdbclient.data.api.TMDBService
import com.skz.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.skz.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.skz.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.skz.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.skz.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDataSource
import com.skz.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apikey : String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService):MovieRemoteDataSource{
        return MovieRemoteDataSourceImpl(tmdbService,apikey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDataSource {
        return TvShowRemoteDataSourceImpl(tmdbService,apikey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmdbService,apikey)
    }

}