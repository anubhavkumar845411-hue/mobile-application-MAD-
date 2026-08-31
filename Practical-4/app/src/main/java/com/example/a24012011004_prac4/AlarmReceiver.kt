package com.example.a24012011004_prac4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        Log.d("MY_ALARM", "🔥 ALARM RECEIVER STARTED")

        val serviceIntent = Intent(context, AlarmService::class.java)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.startForegroundService(serviceIntent)
        } else {
            context.startService(serviceIntent)
        }

        Log.d("MY_ALARM", "🔥 SERVICE START REQUEST SENT")
    }
}