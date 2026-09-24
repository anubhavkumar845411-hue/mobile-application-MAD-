package com.example.shopsprint

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        findViewById<android.view.View>(R.id.btnGetStarted)
            .setOnClickListener {

                startActivity(
                    Intent(this, HomeActivity::class.java)
                )

                finish()
            }
    }
}