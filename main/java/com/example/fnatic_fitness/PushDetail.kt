package com.example.fnatic_fitness

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PushDetail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_push_detail)

        val button = findViewById<Button>(R.id.push_detail_workout)
        button.setOnClickListener {
            val intent = Intent(this, PushProgram::class.java)
            startActivity(intent)
        }
    }
}