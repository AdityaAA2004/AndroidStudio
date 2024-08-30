package com.example.vid_play_app

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import android.net.Uri
import android.net.Uri.*
import com.example.vid_play_app.databinding.ActivityMainBinding
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_main)


        val videoView = findViewById<VideoView>(R.id.testView)


        val mediaController = MediaController(this)

        mediaController.setAnchorView(videoView)


        val uri:Uri = parse(

            "android.resource://" + packageName

                    + "/raw/test"

        )


        videoView.setMediaController(mediaController)

        videoView.setVideoURI(uri)

        videoView.requestFocus()

        videoView.start()
    }
}