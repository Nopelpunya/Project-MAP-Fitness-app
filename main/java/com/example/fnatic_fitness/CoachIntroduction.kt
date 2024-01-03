package com.example.fnatic_fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CoachIntroduction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coach_introduction)

        val button = findViewById<Button>(R.id.btn_ready)
        button.setOnClickListener {
            val intent = Intent(this, ChooseProgram::class.java)
            startActivity(intent)
        }
    }
}