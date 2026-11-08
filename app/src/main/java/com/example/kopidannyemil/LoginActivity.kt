package com.example.kopidannyemil // Sesuaikan dengan nama package kamu jika berbeda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)
        val tvSwitchRegister = findViewById<TextView>(R.id.tv_switch_register)
        val tvFooterRegister = findViewById<TextView>(R.id.tv_footer_register)

        // Navigasi ke RegisterActivity saat klik Tab Register
        tvSwitchRegister?.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }

        // Navigasi ke RegisterActivity saat klik Register Now di footer
        tvFooterRegister?.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }

        // Aksi Tombol Login
        btnLogin?.setOnClickListener {
            val username = etEmail?.text?.toString()?.trim() ?: "User"

            if (username.isEmpty()) {
                Toast.makeText(this, "Isi username terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("EXTRA_USERNAME", username) // Mengirimkan Nama User
                startActivity(intent)
                finish()
            }
        }
    }
}