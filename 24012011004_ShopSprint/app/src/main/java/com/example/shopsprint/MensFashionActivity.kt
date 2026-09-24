package com.example.shopsprint

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MensFashionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_mens_fashion)

        findViewById<android.view.View>(R.id.productMensShirt)
            .setOnClickListener {

                startActivity(
                    Intent(this, ProductDetailsActivity::class.java)
                )
            }

        findViewById<android.view.View>(R.id.productShoes)
            .setOnClickListener {

                startActivity(
                    Intent(this, ProductDetailsActivity::class.java)
                )
            }
    }
}