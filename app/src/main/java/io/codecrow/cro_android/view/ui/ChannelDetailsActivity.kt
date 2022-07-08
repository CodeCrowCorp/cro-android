package io.codecrow.cro_android.view.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import io.codecrow.cro_android.databinding.ActivityChannelDetailsBinding

@AndroidEntryPoint
class ChannelDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChannelDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChannelDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}