package com.example.fnatic_fitness

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PullDetail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pull_detail)

        val button = findViewById<Button>(R.id.pull_detail_workout)
        button.setOnClickListener {
            val intent = Intent(this, PullProgram::class.java)
            startActivity(intent)
        }
    }
}