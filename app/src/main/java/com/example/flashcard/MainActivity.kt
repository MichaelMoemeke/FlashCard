package com.example.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val question = findViewById<TextView>(R.id.flashcard_question)
        val answer = findViewById<TextView>(R.id.flashcard_answer)
        question.setOnClickListener {
            question.visibility = View.INVISIBLE
            answer.visibility = View.VISIBLE
        }
    }
}