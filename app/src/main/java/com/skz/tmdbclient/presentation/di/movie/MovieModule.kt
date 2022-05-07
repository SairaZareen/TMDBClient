package com.skz.tmdbclient.presentation.di.movie

import com.skz.tmdbclient.domain.usecase.GetMoviesUseCase
import com.skz.tmdbclient.domain.usecase.UpdateMoviesUseCase
import com.skz.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory{
        return MovieViewModelFactory(getMoviesUseCase,updateMoviesUseCase)
    }
}