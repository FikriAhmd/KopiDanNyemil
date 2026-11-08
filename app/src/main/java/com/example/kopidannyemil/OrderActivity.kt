package com.example.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import java.text.NumberFormat
import java.util.Locale

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val username = intent.getStringExtra("EXTRA_USERNAME") ?: ""
        val itemName = intent.getStringExtra("EXTRA_ITEM_NAME") ?: ""
        val itemIcon = intent.getStringExtra("EXTRA_ITEM_ICON") ?: ""
        val totalItems = intent.getIntExtra("EXTRA_TOTAL_ITEMS", 0)
        val totalPrice = intent.getIntExtra("EXTRA_TOTAL_PRICE", 0)

        val etFullName = findViewById<EditText>(R.id.etFullName)
        val etAddress = findViewById<EditText>(R.id.etAddress)
        val etBenchmark = findViewById<EditText>(R.id.etBenchmark)
        val btnOrderAndSend = findViewById<Button>(R.id.btnOrderAndSend)
        val btnBackCard = findViewById<CardView>(R.id.btnBackCard)
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val tvTotalAmount = findViewById<TextView>(R.id.tvTotalAmount)
        val tvItemPrice = findViewById<TextView>(R.id.tvItemPrice)
        val tvItemSummary = findViewById<TextView>(R.id.tvItemSummary)
        val tvEditPesanan = findViewById<TextView>(R.id.tvEditPesanan)

        val navHome = findViewById<LinearLayout>(R.id.nav_home)
        val navProfile = findViewById<LinearLayout>(R.id.nav_profile)

        // Rincian Pesanan
        if (totalItems > 0 && itemName.isNotEmpty()) {
            val formatter = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
            val formattedPrice = formatter.format(totalPrice).replace(",00", "")

            tvTotalAmount?.text = formattedPrice
            tvItemPrice?.text = formattedPrice
            tvItemSummary?.text = if (itemIcon.isNotEmpty()) "$itemIcon $itemName x $totalItems" else "$itemName x $totalItems"
        } else {
            tvTotalAmount?.text = "Rp 0"
            tvItemPrice?.text = "Rp 0"
            tvItemSummary?.text = "Belum ada pesanan"
        }

        // Form Kosong Default
        etFullName?.setText("")
        etAddress?.setText("")
        etBenchmark?.setText("")

        // Action Click Arrow Back
        btnBackCard?.setOnClickListener { finish() }
        btnBack?.setOnClickListener { finish() }
        tvEditPesanan?.setOnClickListener { finish() }

        // Navigasi Bottom Bar
        navHome?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_USERNAME", username)
            startActivity(intent)
            finish()
        }

        navProfile?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("EXTRA_USERNAME", username)
            startActivity(intent)
            finish()
        }

        // Submit Form -> ConfirmationActivity
        btnOrderAndSend?.setOnClickListener {
            val name = etFullName.text.toString().trim()
            val address = etAddress.text.toString().trim()
            val benchmark = etBenchmark.text.toString().trim()

            if (name.isEmpty() || address.isEmpty()) {
                Toast.makeText(this, "Mohon isi Nama Lengkap dan Alamat!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (totalItems == 0) {
                Toast.makeText(this, "Keranjang belanja kamu masih kosong!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val fullAddress = if (benchmark.isNotEmpty()) "$address ($benchmark)" else address

            val intent = Intent(this, ConfirmationActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_ADDRESS", fullAddress)
                putExtra("EXTRA_ITEM_NAME", itemName)
                putExtra("EXTRA_ITEM_ICON", itemIcon)
                putExtra("EXTRA_TOTAL_ITEMS", totalItems)
                putExtra("EXTRA_TOTAL_PRICE", totalPrice)
            }
            startActivity(intent)
        }
    }
}