
package com.example.cc1_android.productList

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cc1_android.R
import com.example.cc1_android.data.Product
import com.example.cc1_android.flowerList.ProductsListViewModel
import com.example.cc1_android.flowerList.ProductsListViewModelFactory
import com.example.cc1_android.productDetail.ProductDetailActivity


class ProductsListActivity : AppCompatActivity() {
    private val productsListViewModel by viewModels<ProductsListViewModel> {
        ProductsListViewModelFactory(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar_design))
        val productsAdapter = ProductsAdapter { product -> adapterOnClick(product) }
        val concatAdapter = ConcatAdapter(productsAdapter)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = concatAdapter

        productsListViewModel.productsLiveData.observe(this, {
            it?.let {
                productsAdapter.submitList(it as MutableList<Product>)
            }
        })
    }

    private fun adapterOnClick(product: Product) {
        val intent = Intent(this, ProductDetailActivity()::class.java)
        intent.putExtra(PRODUCT_ID, product.id)
        startActivity(intent)

    }
}