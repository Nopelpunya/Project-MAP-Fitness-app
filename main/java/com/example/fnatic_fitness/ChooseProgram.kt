package com.example.fnatic_fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChooseProgram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_program)

        val buttonpush = findViewById<Button>(R.id.btn_push)
        buttonpush.setOnClickListener {
            val intent = Intent(this, PushDetail::class.java)
            startActivity(intent)
        }
        val buttonpull = findViewById<Button>(R.id.btn_pull)
        buttonpull.setOnClickListener {
            val intent = Intent(this, PullDetail::class.java)
            startActivity(intent)
        }
        val buttonleg = findViewById<Button>(R.id.btn_leg)
        buttonleg.setOnClickListener {
            val intent = Intent(this, LegDetail::class.java)
            startActivity(intent)
        }
    }
}