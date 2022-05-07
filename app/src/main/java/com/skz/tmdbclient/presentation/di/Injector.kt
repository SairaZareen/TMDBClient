package com.skz.tmdbclient.presentation.di

import com.skz.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.skz.tmdbclient.presentation.di.movie.MovieSubComponent
import com.skz.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent():MovieSubComponent
    fun createTvShowSubComponent():TvShowSubComponent
    fun createArtistSubComponent():ArtistSubComponent
}