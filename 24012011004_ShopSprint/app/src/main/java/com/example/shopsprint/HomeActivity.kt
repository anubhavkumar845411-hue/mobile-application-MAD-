package com.example.shopsprint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        findViewById<android.view.View>(R.id.cardMen)
            .setOnClickListener {

                startActivity(
                    Intent(this, MensFashionActivity::class.java)
                )
            }

        findViewById<android.view.View>(R.id.cardProduct)
            .setOnClickListener {

                startActivity(
                    Intent(this, ProductDetailsActivity::class.java)
                )
            }

        findViewById<android.view.View>(R.id.btnCart)
            .setOnClickListener {

                startActivity(
                    Intent(this, CartActivity::class.java)
                )
            }
    }
}