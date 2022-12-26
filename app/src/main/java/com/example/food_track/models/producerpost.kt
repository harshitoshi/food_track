package com.example.food_track.models

import Dao.dao
import android.media.Image
import android.widget.ImageView

data class producerpost (
    val contact: dao = dao(),
    val type: String= "",
    val expiry: String= "",
    val description: String= "",
    val time: Long= 0L
    )