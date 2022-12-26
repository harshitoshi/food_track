package com.example.food_track

import Dao.producerpostDao
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.example.food_track.models.producerpost
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class producerAdd : AppCompatActivity() {
    private lateinit var postdao: producerpostDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producer_add)

        postdao= producerpostDao()
        val post= findViewById<Button>(R.id.postbtn)
        val postInput= findViewById<EditText>(R.id.left).text.toString().trim()
        val description= findViewById<EditText>(R.id.category).text.toString().trim()
        val expiry= findViewById<EditText>(R.id.expirytext).text.toString().trim()

        post.setOnClickListener {
            if(postInput.isNotEmpty()){
                GlobalScope.launch {
                    postdao.insertProducer(postInput, expiry, description)
                }
            }
        }
    }
}