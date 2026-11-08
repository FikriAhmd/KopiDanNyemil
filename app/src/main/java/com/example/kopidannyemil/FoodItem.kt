package com.example.kopidannyemil

data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: Int,
    val priceFormatted: String,
    val imageResId: Int,
    var quantity: Int = 0
)

object DummyData {
    val foodList = mutableListOf(
        FoodItem(1, "Kopi Susu Gula Aren", "Espresso, susu, gula aren", 22000, "Rp 22.000", R.drawable.kopi_aren),
        FoodItem(2, "Donat Cokelat", "Donat empuk, glaze cokelat", 12000, "Rp 12.000", R.drawable.donat_coklat),
        FoodItem(3, "Sourdough Leaf", "Roti fermentasi alami", 35000, "Rp 35.000", R.drawable.sourdough),
        FoodItem(4, "Cappuccino", "Espresso, foam susu lembut", 25000, "Rp 25.000", R.drawable.cappucino),
        FoodItem(5, "Matcha Latte", "Matcha Jepang, susu segar", 27000, "Rp 27.000", R.drawable.matcha)
    )
}