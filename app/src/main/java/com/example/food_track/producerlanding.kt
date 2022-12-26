package com.example.food_track

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.food_track.databinding.ActivityProducermainBinding
import android.text.TextWatcher as Watcher1

class producerlanding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producerlanding)

        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val area = findViewById<EditText>(R.id.editTextTextMultiLine)
        val contact = findViewById<EditText>(R.id.editTextContact)
        val radio= findViewById<RadioGroup>(R.id.radioGroup)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener() {
            if ((TextUtils.isEmpty(email.text.toString())) || (TextUtils.isEmpty(area.text.toString())) || (TextUtils.isEmpty(
                    contact.text.toString()))||radio.checkedRadioButtonId==-1
            ) {
                Toast.makeText(this, "All entries are mandatory", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this, producermain::class.java))
            }
        }
    }
}