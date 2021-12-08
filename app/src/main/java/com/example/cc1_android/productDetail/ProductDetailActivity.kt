package com.example.cc1_android.productDetail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.cc1_android.R
import com.example.cc1_android.productList.PRODUCT_ID

class ProductDetailActivity : AppCompatActivity() {

    private val productDetailViewModel by viewModels<ProductDetailViewModel> {
        ProductDetailViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_detail_activity)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar_design))

        var currentProductId: Long? = null

        val productName: TextView = findViewById(R.id.product_detail_name)
        var productView = findViewById<TextView>(R.id.marque)
        var codebarre = findViewById<TextView>(R.id.code_bar_id)
        var ingredientList =  findViewById<TextView>(R.id.ingredients_id)
        var paysList =  findViewById<TextView>(R.id.pays_id)
        var additif = findViewById<TextView>(R.id.aditif_id)
        var quantite = findViewById<TextView>(R.id.quantite_id)
        var substance = findViewById<TextView>(R.id.substance_id)
        val productImage: ImageView = findViewById(R.id.product_detail_image)
        var nutriscore = findViewById<ImageView>(R.id.nutri_score_id)


        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentProductId = bundle.getLong(PRODUCT_ID)
        }

        currentProductId?.let {
            val currentProduct = productDetailViewModel.getproductForId(it)
            productName.text = currentProduct?.name
            productView.text = currentProduct?.marque

            ingredientList.text = "INGREDIENT : " + currentProduct?.ingredients
            codebarre.text = "CODE BARRE : " + currentProduct?.code_barre
            quantite.text = "QUANTITE : " + currentProduct?.quantiteProduct
            substance.text = "ALLERGENES : " + currentProduct?.alergenes.toString()
            additif.text = "ADITIFS : " + currentProduct?.aditifs.toString()
            paysList.text = "VENDU EN : " + currentProduct?.paysAutorises.toString()
            nutriscore.setImageResource(R.drawable.nutri_score_a)


            if (currentProduct?.image == null) {
                productImage.setImageResource(R.drawable.placeholder)
            } else {
                productImage.setImageResource(currentProduct.image)
            }
        }

    }
}