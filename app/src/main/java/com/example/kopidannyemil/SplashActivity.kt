package com.example.kopidannyemil // Sesuaikan nama package jika berbeda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Animasi Fade-In Gambar Utama
        val imgHero = findViewById<ImageView>(R.id.img_hero)
        imgHero?.let {
            it.alpha = 0f
            it.animate().alpha(1f).setDuration(800).start()
        }

        // Navigasi Tombol Get Started ke LoginActivity
        val btnGetStarted = findViewById<Button>(R.id.btn_get_started)
        btnGetStarted?.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}