package com.skz.tmdbclient.data.model.tvshow
import com.google.gson.annotations.SerializedName
import com.skz.tmdbclient.data.model.tvshow.TvShow

data class TvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow>
)