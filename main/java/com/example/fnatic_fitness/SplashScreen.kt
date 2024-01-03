package com.example.fnatic_fitness

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.fnatic_fitness.MainActivity


class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val decorView = window.decorView
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN;

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java));
            finish()
        }, SPLASH_TIME_OUT)
    }
}