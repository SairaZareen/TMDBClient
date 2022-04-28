package com.skz.tmdbclient.domain.usecase

import com.skz.tmdbclient.data.model.movie.Movie
import com.skz.tmdbclient.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}