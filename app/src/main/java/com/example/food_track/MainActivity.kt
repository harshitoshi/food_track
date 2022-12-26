package com.example.food_track

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoserver(view: View){
        val intent= Intent(this, serverlanding::class.java)
        startActivity(intent)
    }

    fun gotoproducer(view: View){
        val intent= Intent(this, producerFirst::class.java)
        startActivity(intent)
    }

}