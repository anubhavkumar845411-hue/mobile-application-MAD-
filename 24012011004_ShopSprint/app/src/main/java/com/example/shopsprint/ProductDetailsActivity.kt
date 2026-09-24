package com.example.shopsprint

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProductDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_product_details)

        findViewById<android.view.View>(R.id.btnAddToCart)
            .setOnClickListener {

                startActivity(
                    Intent(this, CartActivity::class.java)
                )
            }
    }
}