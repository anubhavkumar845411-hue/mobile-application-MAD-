package com.example.shopsprint

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_categories)

        findViewById<android.view.View>(R.id.categoryMens)
            .setOnClickListener {

                startActivity(
                    Intent(this, MensFashionActivity::class.java)
                )
            }
    }
}