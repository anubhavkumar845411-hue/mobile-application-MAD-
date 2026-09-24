package com.example.shopsprint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsprint.adapter.ProductAdapter
import com.example.shopsprint.data.local.AppDatabase
import kotlinx.coroutines.launch

class ProductListActivity : AppCompatActivity() {

    private lateinit var recyclerProducts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_product_list
        )

        recyclerProducts =
            findViewById(
                R.id.recyclerProducts
            )

        recyclerProducts.layoutManager =
            GridLayoutManager(this, 2)

        loadProducts()
    }

    private fun loadProducts() {

        lifecycleScope.launch {

            val database =
                AppDatabase.getDatabase(
                    this@ProductListActivity
                )

            val products =
                database.productDao()
                    .getProductsByCategory("Men")

            recyclerProducts.adapter =
                ProductAdapter(products) {
                    // Product click
                }
        }
    }
}