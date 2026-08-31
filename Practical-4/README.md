# ⏰ Alarm Clock Android Application

A simple and user-friendly **Alarm Clock Android Application** developed using **Kotlin and Android Studio**.

The application allows users to check the current time, select an alarm time, create an alarm, and cancel the scheduled alarm.

---

## 📱 Project Overview

This project was developed as part of the **Mobile Application Development (MAD)** practical.

The application provides a simple interface for creating an alarm. The user can select a specific time using a Time Picker, and the application schedules the alarm using Android's `AlarmManager`.

When the selected time is reached, the alarm can be received through the `AlarmReceiver` and handled by the alarm service.

---

## ✨ Features

- 🕐 Display current digital time
- ⏰ Select alarm time using Time Picker
- 🔔 Create an alarm
- ❌ Cancel an alarm
- 🔊 Play alarm sound
- 📱 Simple and user-friendly interface
- 🎨 Material Design UI
- ⏳ Schedule alarms using Android AlarmManager
- 🔄 Automatically schedule the alarm for the next day if the selected time has already passed

---

## 🛠️ Technologies Used

- **Kotlin**
- **Android Studio**
- **XML**
- **Material Design**
- **ConstraintLayout**
- **NestedScrollView**
- **AlarmManager**
- **PendingIntent**
- **BroadcastReceiver**
- **Service**
- **TimePickerDialog**

---

## 📂 Project Structure

```text
24012011004_prac4/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com.example.a24012011004_prac4/
│           │       ├── MainActivity.kt
│           │       ├── AlarmReceiver.kt
│           │       └── AlarmService.kt
│           │
│           ├── res/
│           │   ├── drawable/
│           │   ├── layout/
│           │   │   └── activity_main.xml
│           │   ├── mipmap/
│           │   ├── raw/
│           │   │   └── alarm.mp3
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── screenshots/
│   ├── home_screen.png
│   ├── alarm_created.png
│   └── alarm_cancelled.png
│
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── .gitignore
└── README.md