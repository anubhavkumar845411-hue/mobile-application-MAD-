package com.example.shopsprint.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopsprint.R
import com.example.shopsprint.data.local.Product

class ProductAdapter(
    private val products: List<Product>,
    private val onClick: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        val image: ImageView =
            view.findViewById(R.id.imgProduct)

        val name: TextView =
            view.findViewById(R.id.tvProductName)

        val price: TextView =
            view.findViewById(R.id.tvProductPrice)

        val stock: TextView =
            view.findViewById(R.id.tvProductStock)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_product,
                parent,
                false
            )

        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ProductViewHolder,
        position: Int
    ) {

        val product = products[position]

        holder.name.text = product.name

        holder.price.text =
            "₹${product.price}"

        holder.stock.text =
            "Stock: ${product.stock}"

        holder.itemView.setOnClickListener {
            onClick(product)
        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}