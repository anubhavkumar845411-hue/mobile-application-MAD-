package com.example.shopsprint

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.shopsprint.data.local.AppDatabase
import com.example.shopsprint.data.local.Product
import kotlinx.coroutines.launch

class AddProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_add_product
        )

        val name =
            findViewById<EditText>(R.id.etName)

        val price =
            findViewById<EditText>(R.id.etPrice)

        val category =
            findViewById<EditText>(R.id.etCategory)

        val stock =
            findViewById<EditText>(R.id.etStock)

        val description =
            findViewById<EditText>(
                R.id.etDescription
            )

        findViewById<Button>(
            R.id.btnSaveProduct
        ).setOnClickListener {

            val product = Product(

                name = name.text.toString(),

                price =
                    price.text.toString().toDoubleOrNull()
                        ?: 0.0,

                category =
                    category.text.toString(),

                stock =
                    stock.text.toString().toIntOrNull()
                        ?: 0,

                description =
                    description.text.toString()
            )

            lifecycleScope.launch {

                val db =
                    AppDatabase.getDatabase(
                        this@AddProductActivity
                    )

                db.productDao()
                    .insertProduct(product)

                runOnUiThread {

                    Toast.makeText(
                        this@AddProductActivity,
                        "Product Added",
                        Toast.LENGTH_SHORT
                    ).show()

                    finish()
                }
            }
        }
    }
}