package com.example.shopsprint

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_checkout)

        findViewById<android.view.View>(R.id.btnPlaceOrder)
            .setOnClickListener {

                startActivity(
                    Intent(this, OrderTrackingActivity::class.java)
                )

                finish()
            }
    }
}