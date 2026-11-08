package com.example.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val username = intent.getStringExtra("EXTRA_USERNAME") ?: "User"
        val tvProfileName = findViewById<TextView>(R.id.tv_profile_name)
        tvProfileName?.text = "Halo, $username"

        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        navHome?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_USERNAME", username)
            startActivity(intent)
            finish()
        }
    }
}