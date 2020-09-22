package com.example.beerconf.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.beerconf.R
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.beerconf.model.Conference
import com.example.beerconf.model.Speaker
import com.google.firebase.firestore.FirebaseFirestore
import org.json.JSONArray
import org.json.JSONObject
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}

