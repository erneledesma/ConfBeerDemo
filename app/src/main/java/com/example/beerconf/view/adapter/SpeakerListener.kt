package com.example.beerconf.view.adapter

import com.example.beerconf.model.Speaker

interface SpeakerListener {
    fun onSpeakerClicked(speaker: Speaker, position: Int )
}