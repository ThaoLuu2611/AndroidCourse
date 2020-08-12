package com.example.androidcourse

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        setListener()
    }

    fun setListener(){
        var red = findViewById<Button>(R.id.red_button)
        var yellow = findViewById<Button>(R.id.yellow_button)
        var green = findViewById<Button>(R.id.green_button)
        var list: List<View> = listOf(red, yellow, green)
        list.forEach { view -> view.setOnClickListener {
            changeBackground(view)
            Toast.makeText(applicationContext, "color", Toast.LENGTH_SHORT).show()
        }}
    }

    fun changeBackground(view: View){
        when(view.id){
            R.id.red_button -> view.setBackgroundColor(Color.RED)
            R.id.yellow_button -> view.setBackgroundColor(Color.YELLOW)
            R.id.green_button -> view.setBackgroundColor(Color.GREEN)
        }
    }
}