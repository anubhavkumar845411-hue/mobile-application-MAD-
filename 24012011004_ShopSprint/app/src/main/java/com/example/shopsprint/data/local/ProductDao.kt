package com.example.shopsprint.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {

    @Insert
    suspend fun insertProduct(product: Product)

    @Update
    suspend fun updateProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("SELECT * FROM products")
    suspend fun getAllProducts(): List<Product>

    @Query(
        "SELECT * FROM products WHERE category = :category"
    )
    suspend fun getProductsByCategory(
        category: String
    ): List<Product>

    @Query(
        "SELECT * FROM products WHERE id = :id LIMIT 1"
    )
    suspend fun getProductById(
        id: Int
    ): Product?

    @Query(
        "SELECT * FROM products WHERE name LIKE '%' || :query || '%'"
    )
    suspend fun searchProducts(
        query: String
    ): List<Product>
}