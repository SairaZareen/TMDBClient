package com.skz.tmdbclient.presentation.di.artist

import com.skz.tmdbclient.domain.usecase.GetArtistUseCase
import com.skz.tmdbclient.domain.usecase.UpdateArtistUseCase
import com.skz.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistUseCase: GetArtistUseCase,
        updateArtistUseCase: UpdateArtistUseCase
    ): ArtistViewModelFactory {
       return ArtistViewModelFactory(
           getArtistUseCase,
           updateArtistUseCase
       )
    }
}