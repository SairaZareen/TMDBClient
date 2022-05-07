package com.skz.tmdbclient.presentation.di.core

import android.content.Context
import com.skz.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.skz.tmdbclient.presentation.di.movie.MovieSubComponent
import com.skz.tmdbclient.presentation.di.tvshow.TvShowSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class,TvShowSubComponent::class,ArtistSubComponent::class])
class AppModule(private val context: Context)  {

    @Provides
    @Singleton
    fun provideApplicationContext():Context{
        return context.applicationContext
    }
}