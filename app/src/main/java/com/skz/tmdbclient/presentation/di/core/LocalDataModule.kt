package com.skz.tmdbclient.presentation.di.core

import com.skz.tmdbclient.data.db.ArtistDao
import com.skz.tmdbclient.data.db.MovieDao
import com.skz.tmdbclient.data.db.TvShowDao
import com.skz.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.skz.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.skz.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.skz.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.skz.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.skz.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao) : MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao) : TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao) : ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }

}