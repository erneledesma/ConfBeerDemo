package com.example.beerconf.network

import com.example.beerconf.model.Conference
import com.example.beerconf.model.Speaker
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings

const val SPEAKERS_COLLECTION_NAME = "speakers"
const val CONFERENCE_COLLECTION_NAME = "conferences"

class FirestoreService {
    val firebaseFirestore = FirebaseFirestore.getInstance()
    val setting = FirebaseFirestoreSettings.Builder().setPersistenceEnabled(true).build()

    init {
        firebaseFirestore.firestoreSettings = setting
    }

    fun getSpeakers(callback: Callback<List<Speaker>>) {
        firebaseFirestore.collection(SPEAKERS_COLLECTION_NAME)
            .orderBy("category")
            .get()
            .addOnSuccessListener { result ->
                for (doc in result) {
                    // obtengo una lista el resultado de firestore
                    val list = result.toObjects(Speaker:: class.java) // tenemos toda la lista de las collection
                    callback.onSuccess(list)
                    break
                }
            }
    }

    fun getSchedule(callback : Callback<List<Conference>>) {
        firebaseFirestore.collection(CONFERENCE_COLLECTION_NAME)
            .get()
            .addOnSuccessListener { result ->
                for(doc in result) {
                    var list = result.toObjects(Conference::class.java)
                    callback.onSuccess(list)
                    break
                }
            }
    }

}