package com.example.cc1_android.data

import androidx.annotation.DrawableRes
import com.example.cc1_android.productDetail.NutritionFactsItem

data class Product(
    val id: Long,
    val code_barre: String,
    val name: String,
    @DrawableRes
    val image: Int?,
    val marque: String,
    val quantiteProduct:String,
    val paysAutorises: List<String>,
    val ingredients: List<String>,
    val alergenes: List<String>,
    val aditifs: List<String>,
    val quantiteProductPerPortion:String,
    val quantiteProductPer100:String,
    val unit: String,
    val nutritionfacts: NutritionFactsItem = NutritionFactsItem(unit,quantiteProductPerPortion, quantiteProductPer100),
)

