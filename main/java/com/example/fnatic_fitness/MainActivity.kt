package com.example.fnatic_fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_start)
        button.setOnClickListener{
            val intent = Intent(this, CoachIntroduction::class.java)
            startActivity(intent)
        }
    }
}