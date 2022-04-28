package com.skz.tmdbclient.domain.usecase

import com.skz.tmdbclient.data.model.artist.Artist
import com.skz.tmdbclient.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepository : ArtistRepository) {

    suspend fun execute():List<Artist>? = artistRepository.getArtists()

}