package com.example.androidcourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View){
        when(view.id) {
            R.id.bio_button -> {
                var intent = Intent(this, BioActivity::class.java)
                startActivity(intent)
            }

            R.id.color_button -> {
                var intent = Intent(this, ColorActivity::class.java)
                startActivity(intent)
            }

        }

    }
}