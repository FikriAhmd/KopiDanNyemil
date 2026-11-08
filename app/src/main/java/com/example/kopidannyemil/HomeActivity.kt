package com.example.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat
import java.util.Locale

class HomeActivity : AppCompatActivity() {

    private val itemNames = arrayOf("Kopi Susu Gula Aren", "Donat Cokelat", "Sourdough Leaf", "Cappuccino", "Matcha Latte")
    private val itemIcons = arrayOf("☕", "🍩", "🍞", "☕", "🍵")
    private val itemPrices = intArrayOf(22000, 12000, 18000, 24000, 25000)

    private val horizontalCounts = IntArray(5) { 0 }
    private val verticalCounts = IntArray(5) { 0 }

    private var layoutCheckoutBar: RelativeLayout? = null
    private var tvCartCount: TextView? = null
    private var tvCartTotalPrice: TextView? = null

    private var currentTotalItems = 0
    private var currentTotalPrice = 0
    private var username: String = "User"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        username = intent.getStringExtra("EXTRA_USERNAME") ?: "Fikri Ahmad Ramdani"
        findViewById<TextView>(R.id.tv_greeting_user)?.text = "Halo $username,"

        val navProfile = findViewById<LinearLayout>(R.id.nav_profile)
        navProfile?.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("EXTRA_USERNAME", username)
            startActivity(intent)
        }

        val navOrder = findViewById<LinearLayout>(R.id.nav_order)
        navOrder?.setOnClickListener {
            openOrderPage()
        }

        layoutCheckoutBar = findViewById(R.id.layout_checkout_bar)
        tvCartCount = findViewById(R.id.tv_cart_count)
        tvCartTotalPrice = findViewById(R.id.tv_cart_total_price)

        layoutCheckoutBar?.setOnClickListener {
            openOrderPage()
        }

        setupHorizontalCounter(0, R.id.h_btn_add_1, R.id.h_layout_counter_1, R.id.h_btn_minus_1, R.id.h_btn_plus_1, R.id.h_tv_count_1)
        setupHorizontalCounter(1, R.id.h_btn_add_2, R.id.h_layout_counter_2, R.id.h_btn_minus_2, R.id.h_btn_plus_2, R.id.h_tv_count_2)
        setupHorizontalCounter(2, R.id.h_btn_add_3, R.id.h_layout_counter_3, R.id.h_btn_minus_3, R.id.h_btn_plus_3, R.id.h_tv_count_3)
        setupHorizontalCounter(3, R.id.h_btn_add_4, R.id.h_layout_counter_4, R.id.h_btn_minus_4, R.id.h_btn_plus_4, R.id.h_tv_count_4)
        setupHorizontalCounter(4, R.id.h_btn_add_5, R.id.h_layout_counter_5, R.id.h_btn_minus_5, R.id.h_btn_plus_5, R.id.h_tv_count_5)

        setupVerticalCounter(0, R.id.btn_add_1, R.id.layout_counter_1, R.id.btn_minus_1, R.id.btn_plus_1, R.id.tv_count_1)
        setupVerticalCounter(1, R.id.btn_add_2, R.id.layout_counter_2, R.id.btn_minus_2, R.id.btn_plus_2, R.id.tv_count_2)
        setupVerticalCounter(2, R.id.btn_add_3, R.id.layout_counter_3, R.id.btn_minus_3, R.id.btn_plus_3, R.id.tv_count_3)
        setupVerticalCounter(3, R.id.btn_add_4, R.id.layout_counter_4, R.id.btn_minus_4, R.id.btn_plus_4, R.id.tv_count_4)
        setupVerticalCounter(4, R.id.btn_add_5, R.id.layout_counter_5, R.id.btn_minus_5, R.id.btn_plus_5, R.id.tv_count_5)
    }

    private fun openOrderPage() {
        var selectedItemName = ""
        var selectedItemIcon = ""
        var selectedCount = 0

        for (i in 0 until 5) {
            val totalCount = horizontalCounts[i] + verticalCounts[i]
            if (totalCount > 0) {
                selectedItemName = itemNames[i]
                selectedItemIcon = itemIcons[i]
                selectedCount = totalCount
                break
            }
        }

        val intent = Intent(this, OrderActivity::class.java).apply {
            putExtra("EXTRA_USERNAME", username)
            putExtra("EXTRA_ITEM_NAME", selectedItemName)
            putExtra("EXTRA_ITEM_ICON", selectedItemIcon)
            putExtra("EXTRA_TOTAL_ITEMS", selectedCount)
            putExtra("EXTRA_TOTAL_PRICE", currentTotalPrice)
        }
        startActivity(intent)
    }

    private fun setupHorizontalCounter(index: Int, addId: Int, layoutId: Int, minusId: Int, plusId: Int, textId: Int) {
        val btnAdd = findViewById<ImageView>(addId)
        val layoutCounter = findViewById<LinearLayout>(layoutId)
        val btnMinus = findViewById<ImageView>(minusId)
        val btnPlus = findViewById<ImageView>(plusId)
        val tvCount = findViewById<TextView>(textId)

        btnAdd?.setOnClickListener {
            horizontalCounts[index] = 1
            tvCount?.text = "1"
            btnAdd.visibility = View.GONE
            layoutCounter?.visibility = View.VISIBLE
            updateCheckoutBar()
        }

        btnPlus?.setOnClickListener {
            horizontalCounts[index]++
            tvCount?.text = horizontalCounts[index].toString()
            updateCheckoutBar()
        }

        btnMinus?.setOnClickListener {
            horizontalCounts[index]--
            if (horizontalCounts[index] <= 0) {
                horizontalCounts[index] = 0
                layoutCounter?.visibility = View.GONE
                btnAdd?.visibility = View.VISIBLE
            } else {
                tvCount?.text = horizontalCounts[index].toString()
            }
            updateCheckoutBar()
        }
    }

    private fun setupVerticalCounter(index: Int, addId: Int, layoutId: Int, minusId: Int, plusId: Int, textId: Int) {
        val btnAdd = findViewById<ImageView>(addId)
        val layoutCounter = findViewById<LinearLayout>(layoutId)
        val btnMinus = findViewById<ImageView>(minusId)
        val btnPlus = findViewById<ImageView>(plusId)
        val tvCount = findViewById<TextView>(textId)

        btnAdd?.setOnClickListener {
            verticalCounts[index] = 1
            tvCount?.text = "1"
            btnAdd.visibility = View.GONE
            layoutCounter?.visibility = View.VISIBLE
            updateCheckoutBar()
        }

        btnPlus?.setOnClickListener {
            verticalCounts[index]++
            tvCount?.text = verticalCounts[index].toString()
            updateCheckoutBar()
        }

        btnMinus?.setOnClickListener {
            verticalCounts[index]--
            if (verticalCounts[index] <= 0) {
                verticalCounts[index] = 0
                layoutCounter?.visibility = View.GONE
                btnAdd?.visibility = View.VISIBLE
            } else {
                tvCount?.text = verticalCounts[index].toString()
            }
            updateCheckoutBar()
        }
    }

    private fun updateCheckoutBar() {
        currentTotalItems = 0
        currentTotalPrice = 0

        for (i in 0 until 5) {
            val count = horizontalCounts[i] + verticalCounts[i]
            currentTotalItems += count
            currentTotalPrice += count * itemPrices[i]
        }

        if (currentTotalItems > 0) {
            val formatter = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
            val formattedPrice = formatter.format(currentTotalPrice).replace(",00", "")

            tvCartCount?.text = "$currentTotalItems item"
            tvCartTotalPrice?.text = formattedPrice
            layoutCheckoutBar?.visibility = View.VISIBLE
        } else {
            layoutCheckoutBar?.visibility = View.GONE
        }
    }
}