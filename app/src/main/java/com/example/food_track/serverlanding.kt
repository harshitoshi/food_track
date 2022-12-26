package com.example.food_track

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class serverlanding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serverlanding)
        val contact= findViewById<EditText>(R.id.editTextPhone)
        val area= findViewById<EditText>(R.id.editarea)
        val btn= findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
            if((TextUtils.isEmpty(contact.text.toString()))||(TextUtils.isEmpty(area.text.toString()))){
                    Toast.makeText(this, "Area and contact are required", Toast.LENGTH_SHORT).show()
            }
            else{
                startActivity(Intent(this, servermain::class.java))
            }
        }
    }
}