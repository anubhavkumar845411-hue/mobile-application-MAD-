# 📱 Android Intent-Based Application

## 📌 Overview

This practical demonstrates the use of **Intents in Android application development** using Kotlin.

The application provides a simple interface through which users can perform different Android operations such as opening a web page, making a phone call, viewing call logs, opening the gallery, launching the camera, accessing alarms, and navigating to another activity.

The main purpose of this practical is to understand how Android applications communicate with:

- Other Android applications
- System applications
- Android components within the same application

The application demonstrates both **Implicit Intents** and **Explicit Intents**.

---

## 🎯 Objectives

The main objectives of this practical are:

- To understand the concept of Android Intents.
- To implement **Implicit Intent** in Kotlin.
- To implement **Explicit Intent** in Kotlin.
- To open a website using an Intent.
- To open the phone dialer with a specified phone number.
- To access the device's alarm application.
- To launch the device camera.
- To view the call log.
- To open images using the gallery application.
- To navigate from one Activity to another Activity.
- To understand how Android system applications can be accessed using Intent actions.

---

## 🧠 What is an Intent?

An **Intent** is a messaging object used in Android to request an action from another application component.

Intents are mainly used to:

- Start an Activity
- Start a Service
- Send a Broadcast
- Communicate between Android components
- Launch system applications
- Share data between applications

There are two major types of Intents demonstrated in this practical:

### 1. Implicit Intent

An **Implicit Intent** does not specify a particular component or Activity.

Instead, it specifies an action that needs to be performed. Android finds an appropriate application or component capable of handling that action.

Examples used in this practical include:

- Opening a website
- Opening the phone dialer
- Opening alarms
- Launching the camera
- Viewing call logs
- Opening the gallery

### 2. Explicit Intent

An **Explicit Intent** specifies the exact component that should be started.

In this practical, an Explicit Intent is used to open another Activity within the same application.

---

# ✨ Features

The application provides the following functionality:

| Feature | Description | Intent Type |
|--------|-------------|-------------|
| 🌐 Web Browser | Opens the entered website URL | Implicit |
| 📞 Phone Dialer | Opens the dialer with the entered number | Implicit |
| ⏰ Alarm | Opens the device alarm application | Implicit |
| 📷 Camera | Launches the device camera | Implicit |
| 📋 Call Log | Opens the device call log | Implicit |
| 🖼️ Gallery | Opens images using an external application | Implicit |
| 🔐 Login | Opens another Activity inside the application | Explicit |

---

# 🌐 1. Opening a Web URL

The application contains an input field where the user can enter a website URL.

When the **Button** is pressed, an Intent with `ACTION_VIEW` is created.

```kotlin
Intent(
    Intent.ACTION_VIEW,
    Uri.parse(
        findViewById<EditText>(R.id.editTextText)
            .text.toString()
    )
).also {
    startActivity(it)
}