package com.example.a24012011004_prac2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val toast  = Toast.makeText(applicationContext , "onCreate Called"  , Toast.LENGTH_LONG).show()
    }


    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
    }


    override fun onRestart() {
        super.onRestart()
        val toast  = Toast.makeText(applicationContext , "onRestart  called " , Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val toast  = Toast.makeText(applicationContext , "onPause  called " , Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        val toast  = Toast.makeText(applicationContext , "onResume  called " , Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast  = Toast.makeText(applicationContext , "onDestroy  called " , Toast.LENGTH_LONG).show()
    }
}