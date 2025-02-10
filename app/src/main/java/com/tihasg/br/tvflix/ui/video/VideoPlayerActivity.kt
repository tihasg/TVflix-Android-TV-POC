package com.tihasg.br.tvflix.ui.video

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.tihasg.br.tvflix.base.BaseActivity
import com.tihasg.br.tvflix.databinding.ActivityVideoPlayerBinding

class VideoPlayerActivity : BaseActivity<ActivityVideoPlayerBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityVideoPlayerBinding
        get() = ActivityVideoPlayerBinding::inflate

    private lateinit var player: ExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val videoUrl = intent.getStringExtra("VIDEO_URL") ?: return
        setupPlayer(videoUrl)
    }

    private fun setupPlayer(url: String) {
        player = ExoPlayer.Builder(this).build()
        binding.playerView.player = player
        player.setMediaItem(MediaItem.fromUri(Uri.parse(url)))
        player.prepare()
        player.playWhenReady = true
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}
