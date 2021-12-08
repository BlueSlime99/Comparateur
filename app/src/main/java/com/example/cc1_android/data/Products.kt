package com.example.cc1_android.data

import android.content.res.Resources
import com.example.cc1_android.R
import com.example.cc1_android.productDetail.NutritionFactsItem

fun productList(resources: Resources): List<Product> {
    return listOf(
        Product(
            id = 1,
            name = resources.getString(R.string.product1_name),
            image = R.drawable.petit_pois,
            marque = resources.getString(R.string.marque1),
            quantiteProduct = resources.getString(R.string.quantite1),
            paysAutorises = resources.getStringArray(R.array.liste_pays1).toList(),
            ingredients = resources.getStringArray(R.array.liste_ingredients1).toList(),
            alergenes = resources.getStringArray(R.array.liste_alergenes1).toList(),
            aditifs = resources.getStringArray(R.array.liste_aditifs1).toList(),
            unit = resources.getString (R.string.unit),
            quantiteProductPerPortion = resources.getString (R.string.quantiteProductPerPortion),
            quantiteProductPer100 = resources.getString (R.string.quantiteProductPer100),
            nutritionfacts = NutritionFactsItem(resources.getString (R.string.unit),resources.getString (R.string.unit), resources.getString (R.string.unit)),
            code_barre = resources.getString(R.string.codebarre1),
        ),
        Product(
            id = 2,
            name = resources.getString(R.string.product2_name),
            image = R.drawable.champignon,
            marque = resources.getString(R.string.marque2),
            quantiteProduct = resources.getString(R.string.quantite2),
            paysAutorises = resources.getStringArray(R.array.liste_pays2).toList(),
            ingredients = resources.getStringArray(R.array.liste_ingredients2).toList(),
            alergenes = resources.getStringArray(R.array.liste_alergenes2).toList(),
            aditifs = resources.getStringArray(R.array.liste_aditifs2).toList(),
            unit = resources.getString (R.string.unit),
            quantiteProductPerPortion = resources.getString (R.string.quantiteProductPerPortion),
            quantiteProductPer100 = resources.getString (R.string.quantiteProductPer100),
            nutritionfacts = NutritionFactsItem(resources.getString (R.string.unit),resources.getString (R.string.unit), resources.getString (R.string.unit)),
            code_barre = resources.getString((R.string.codebarre2))

        ),
        Product(
            id = 3,
            name = resources.getString(R.string.product3_name),
            image = R.drawable.mais,
            marque = resources.getString(R.string.marque3),
            quantiteProduct = resources.getString(R.string.quantite3),
            paysAutorises = resources.getStringArray(R.array.liste_pays3).toList(),
            ingredients = resources.getStringArray(R.array.liste_ingredients3).toList(),
            alergenes = resources.getStringArray(R.array.liste_alergenes3).toList(),
            aditifs = resources.getStringArray(R.array.liste_aditifs3).toList(),
            unit = resources.getString (R.string.unit),
            quantiteProductPerPortion = resources.getString (R.string.quantiteProductPerPortion),
            quantiteProductPer100 = resources.getString (R.string.quantiteProductPer100),
            nutritionfacts = NutritionFactsItem(resources.getString (R.string.unit),resources.getString (R.string.unit), resources.getString (R.string.unit)),
            code_barre = resources.getString((R.string.codebarre3))

        ),
        Product(
            id = 4,
            name = resources.getString(R.string.product4_name),
            image = R.drawable.haricot_verts,
            marque = resources.getString(R.string.marque4),
            quantiteProduct = resources.getString(R.string.quantite4),
            paysAutorises = resources.getStringArray(R.array.liste_pays4).toList(),
            ingredients = resources.getStringArray(R.array.liste_ingredients4).toList(),
            alergenes = resources.getStringArray(R.array.liste_alergenes4).toList(),
            aditifs = resources.getStringArray(R.array.liste_aditifs4).toList(),
            unit = resources.getString (R.string.unit),
            quantiteProductPerPortion = resources.getString (R.string.quantiteProductPerPortion),
            quantiteProductPer100 = resources.getString (R.string.quantiteProductPer100),
            nutritionfacts = NutritionFactsItem(resources.getString (R.string.unit),resources.getString (R.string.unit), resources.getString (R.string.unit)),
            code_barre = resources.getString((R.string.codebarre4))

        ),

    )
}
