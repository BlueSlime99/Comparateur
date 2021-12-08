
package com.example.cc1_android.productDetail

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cc1_android.data.DataSource
import com.example.cc1_android.data.Product

class ProductDetailViewModel(private val datasource: DataSource) : ViewModel() {

    fun getproductForId(id: Long) : Product? {
        return datasource.getProductForId(id)
    }
}

class ProductDetailViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProductDetailViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ProductDetailViewModel(
                datasource = DataSource.getDataSource(context.resources)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}