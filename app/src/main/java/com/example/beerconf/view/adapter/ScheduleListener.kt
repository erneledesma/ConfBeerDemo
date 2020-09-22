package com.example.beerconf.view.adapter

import com.example.beerconf.model.Conference
import java.text.FieldPosition


interface ScheduleListener {
    fun onConferenceClicked(conference: Conference, position: Int )

}