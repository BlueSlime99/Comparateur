package com.example.cc1_android.productDetail

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cc1_android.R

class NutritionFactDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nutrition_list_details)


        val energie_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "600")
        val mg_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "4,5")
        val acide_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "5")
        val glucide_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "50")
        val sucre_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "4,5")
        val fibre_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "12")
        val protein_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "35")
        val sel_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "77")
        val sodium_item : NutritionFactsItem = NutritionFactsItem("Kj","200", "68")


        val energie_text = findViewById<TextView>(R.id.energie)
        var mg = findViewById<TextView>(R.id.matiere_grasse)
        var acide = findViewById<TextView>(R.id.Acides)
        var glucide = findViewById<TextView>(R.id.Glucides)
        var sucre = findViewById<TextView>(R.id.Sucres)
        var fibre = findViewById<TextView>(R.id.Fibres)
        val protein = findViewById<TextView>(R.id.Proteines)
        var sel = findViewById<TextView>(R.id.sel)

        val item : NutritionFacts = NutritionFacts(
            energie_item,
            mg_item,
            acide_item,
            glucide_item,
            sucre_item,
            fibre_item,
            protein_item,
            sel_item,
            sodium_item
        )


        energie_text.text = item.energie.quantiteProductPer100
        mg.text = item.matiereGrasse.quantiteProductPer100
        acide.text = item.acideGras.quantiteProductPer100
        glucide.text = item.glucide.quantiteProductPer100
        sucre.text = item.sucre.quantiteProductPer100
        fibre.text = item.fibre.quantiteProductPer100
        protein.text = item.protein.quantiteProductPer100


    }

}