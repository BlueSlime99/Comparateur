
package com.example.cc1_android.data

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataSource(resources: Resources) {
    private val initialproductList = productList(resources)
    private val productsLiveData = MutableLiveData(initialproductList)

    fun getProductForId(id: Long): Product? {
        productsLiveData.value?.let { products ->
            return products.firstOrNull{ it.id == id}
        }
        return null
    }

    fun getProductList(): LiveData<List<Product>> {
        return productsLiveData
    }


    companion object {
        private var INSTANCE: DataSource? = null

        fun getDataSource(resources: Resources): DataSource {
            return synchronized(DataSource::class) {
                val newInstance = INSTANCE ?: DataSource(resources)
                INSTANCE = newInstance
                newInstance
            }
        }
    }
}