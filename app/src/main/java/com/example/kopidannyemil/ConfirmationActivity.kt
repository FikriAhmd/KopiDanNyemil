package com.example.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat
import java.util.Locale

class ConfirmationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val name = intent.getStringExtra("EXTRA_NAME") ?: "Fikri"
        val address = intent.getStringExtra("EXTRA_ADDRESS") ?: "-"
        val totalItems = intent.getIntExtra("EXTRA_TOTAL_ITEMS", 1)
        val totalPrice = intent.getIntExtra("EXTRA_TOTAL_PRICE", 12000)

        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val tvOrderSummary = findViewById<TextView>(R.id.tvOrderSummary)
        val tvDeliveryAddress = findViewById<TextView>(R.id.tvDeliveryAddress)
        val btnOk = findViewById<Button>(R.id.btnOk)
        val containerCheck = findViewById<FrameLayout>(R.id.containerCheck)

        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        val navMenu = findViewById<LinearLayout>(R.id.nav_menu)
        val navProfile = findViewById<LinearLayout>(R.id.nav_profile)

        // Menjalankan animasi denyut pada icon ceklis
        val pulseAnim = AnimationUtils.loadAnimation(this, R.anim.pulse_animation)
        containerCheck?.startAnimation(pulseAnim)

        tvGreeting?.text = "Halo $name,"

        val formatter = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
        val formattedPrice = formatter.format(totalPrice).replace(",00", "")

        tvOrderSummary?.text = "$totalItems item • $formattedPrice"
        tvDeliveryAddress?.text = "Dikirim ke: $address"

        btnOk?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java).apply {
                putExtra("EXTRA_USERNAME", name)
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
            finish()
        }

        navHome?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_USERNAME", name)
            startActivity(intent)
            finish()
        }

        navMenu?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_USERNAME", name)
            startActivity(intent)
            finish()
        }

        navProfile?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("EXTRA_USERNAME", name)
            startActivity(intent)
            finish()
        }
    }
}