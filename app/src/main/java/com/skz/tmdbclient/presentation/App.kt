package com.skz.tmdbclient.presentation

import android.app.Application
import com.skz.tmdbclient.BuildConfig
import com.skz.tmdbclient.presentation.di.Injector
import com.skz.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.skz.tmdbclient.presentation.di.core.*
import com.skz.tmdbclient.presentation.di.movie.MovieSubComponent
import com.skz.tmdbclient.presentation.di.tvshow.TvShowSubComponent

class App  : Application(),Injector{

    private lateinit var appComponent:AppComponent


    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }
    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowsSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }
}