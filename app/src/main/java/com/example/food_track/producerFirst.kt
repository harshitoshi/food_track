package com.example.food_track

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class producerFirst : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producer_first)

        val button= findViewById<FloatingActionButton>(R.id.addButton)
        button.setOnClickListener {
            val intent = Intent(this, producerAdd::class.java)
            startActivity(intent)
        }
    }
}