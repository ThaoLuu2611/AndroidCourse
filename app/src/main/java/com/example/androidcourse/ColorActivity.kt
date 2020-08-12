package com.example.androidcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
    }

    fun clickHandler(view: View){
        var editText = findViewById<EditText>(R.id.nick_edit)
        var nameText = findViewById<TextView>(R.id.nick_text)
        nameText.visibility = View.VISIBLE
        nameText.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
    }
}