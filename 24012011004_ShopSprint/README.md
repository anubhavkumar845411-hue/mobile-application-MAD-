# 🛍️ ShopSprint

### Smart Local Shopping Platform

<p align="center">
  <b>A modern Android shopping application built with Kotlin and XML</b>
</p>

<p align="center">
  Browse products • Manage cart • Checkout • Track orders • Manage products
</p>

---

## 📱 About

**ShopSprint** is a Smart Local Shopping Platform developed as a Mobile Application Development project.

The application provides a complete shopping experience where users can explore products, browse categories, view product details, add items to their cart, proceed to checkout, and track orders.

The project also includes product management functionality and uses a local database to store product information.

---

## ✨ Features

### 🛒 Customer Experience

- 🏠 **Home Dashboard** — Discover available products
- 📂 **Categories** — Browse products by category
- 🔍 **Product Listing** — View available products
- 📦 **Product Details** — View detailed product information
- 🛒 **Shopping Cart** — Add and manage products
- 💳 **Checkout** — Review and place orders
- 🚚 **Order Tracking** — Track order status

### 👨‍💼 Product Management

- ➕ Add new products
- 📋 Manage product information
- 🗂️ Organize products by category
- 💾 Store product data locally

---

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| **Kotlin** | Application logic |
| **XML** | UI development |
| **Android Studio** | Development environment |
| **Room Database** | Local data storage |
| **RecyclerView** | Product lists |
| **Gradle** | Build & dependency management |
| **Android SDK** | Android development |

---

## 🏗️ Architecture & Structure

```text
ShopSprint
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/shopsprint/
│           │       │
│           │       ├── Activities
│           │       │   ├── MainActivity.kt
│           │       │   ├── HomeActivity.kt
│           │       │   ├── CategoriesActivity.kt
│           │       │   ├── ProductListActivity.kt
│           │       │   ├── ProductDetailsActivity.kt
│           │       │   ├── CartActivity.kt
│           │       │   ├── CheckoutActivity.kt
│           │       │   ├── OrderTrackingActivity.kt
│           │       │   └── AddProductActivity.kt
│           │       │
│           │       ├── adapter/
│           │       │   └── ProductAdapter.kt
│           │       │
│           │       └── data/
│           │           └── local/
│           │               ├── AppDatabase.kt
│           │               ├── Product.kt
│           │               └── ProductDao.kt
│           │
│           └── res/
│               ├── drawable/
│               ├── layout/
│               ├── mipmap/
│               ├── values/
│               └── xml/
│
├── gradle/
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
