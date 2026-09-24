package com.example.shopsprint.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val name: String,

    val price: Double,

    val category: String,

    val description: String,

    val stock: Int,

    val image: String = "",

    val rating: Double = 0.0
)