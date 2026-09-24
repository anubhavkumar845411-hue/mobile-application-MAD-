package com.example.shopsprint

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cart)

        findViewById<android.view.View>(R.id.btnCheckout)
            .setOnClickListener {

                startActivity(
                    Intent(this, CheckoutActivity::class.java)
                )
            }
    }
}