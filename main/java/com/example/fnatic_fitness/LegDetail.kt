package com.example.fnatic_fitness

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LegDetail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leg_detail)

        val button = findViewById<Button>(R.id.leg_detail_workout)
        button.setOnClickListener {
            val intent = Intent(this, LegProgram::class.java)
            startActivity(intent)
        }
    }
}