package com.skz.tmdbclient.presentation

import android.R.attr.bitmap
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.skz.tmdbclient.R
import com.skz.tmdbclient.databinding.ActivityHomeBinding
import com.skz.tmdbclient.presentation.artist.ArtistActivity
import com.skz.tmdbclient.presentation.movie.MovieActivity
import com.skz.tmdbclient.presentation.tvshow.TvShowActivity
import com.vansuita.gaussianblur.GaussianBlur


class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)
        binding.movieButton.setOnClickListener {
            val intent = Intent(this,MovieActivity::class.java)
            startActivity(intent)
        }
        binding.tvShowButton.setOnClickListener {
            val intent = Intent(this,TvShowActivity::class.java)
            startActivity(intent)
        }
        binding.artistButton.setOnClickListener {
            val intent = Intent(this,ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}