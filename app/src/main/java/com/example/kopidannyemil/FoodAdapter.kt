package com.example.kopidannyemil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(
    private val foodList: List<FoodItem>,
    private val onItemQuantityChanged: () -> Unit
) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvFoodName)
        val tvDesc: TextView = itemView.findViewById(R.id.tvFoodDesc)
        val tvPrice: TextView = itemView.findViewById(R.id.tvFoodPrice)
        val imgFood: ImageView = itemView.findViewById(R.id.imgFood)
        val btnInitialAdd: Button = itemView.findViewById(R.id.btnInitialAdd)
        val layoutCounter: LinearLayout = itemView.findViewById(R.id.layoutCounter)
        val tvQuantity: TextView = itemView.findViewById(R.id.tvQuantity)
        val btnPlus: Button = itemView.findViewById(R.id.btnPlus)
        val btnMinus: Button = itemView.findViewById(R.id.btnMinus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val item = foodList[position]
        holder.tvName.text = item.name
        holder.tvDesc.text = item.description
        holder.tvPrice.text = item.priceFormatted
        holder.imgFood.setImageResource(item.imageResId)

        fun updateUI() {
            if (item.quantity > 0) {
                holder.btnInitialAdd.visibility = View.GONE
                holder.layoutCounter.visibility = View.VISIBLE
                holder.tvQuantity.text = item.quantity.toString()
            } else {
                holder.btnInitialAdd.visibility = View.VISIBLE
                holder.layoutCounter.visibility = View.GONE
            }
        }

        updateUI()

        holder.btnInitialAdd.setOnClickListener {
            item.quantity = 1
            updateUI()
            onItemQuantityChanged()
        }

        holder.btnPlus.setOnClickListener {
            item.quantity++
            updateUI()
            onItemQuantityChanged()
        }

        holder.btnMinus.setOnClickListener {
            if (item.quantity > 0) {
                item.quantity--
                updateUI()
                onItemQuantityChanged()
            }
        }
    }

    override fun getItemCount() = foodList.size
}