package com.example.cc1_android.productList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cc1_android.R
import com.example.cc1_android.data.Product


const val PRODUCT_ID = "product id"

class ProductsAdapter(private val onClick: (Product) -> Unit) :
    ListAdapter<Product, ProductsAdapter.ProductViewHolder>(ProductDiffCallback) {

    class ProductViewHolder(itemView: View, val onClick: (Product) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        private val productTextView: TextView = itemView.findViewById(R.id.product_detail_name)
        private val productTitleView: TextView = itemView.findViewById(R.id.marque)
        private val productImageView: ImageView = itemView.findViewById(R.id.product_detail_image)
        private var currentProduct: Product? = null

        init {
            itemView.setOnClickListener {
                currentProduct?.let {
                    onClick(it)
                }
            }
        }

        fun bind(product: Product) {
            currentProduct = product

            productTextView.text = product.name
            productTitleView.text = product.marque

            if (product.image != null) {
                productImageView.setImageResource(product.image)
            } else {
                productImageView.setImageResource(R.drawable.placeholder)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)
        return ProductViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = getItem(position)
        holder.bind(product)

    }
}

object ProductDiffCallback : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.id == newItem.id
    }
}