package com.example.a24012011004_prac4

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.content.pm.ServiceInfo
import android.media.MediaPlayer
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper

class AlarmService : Service() {

    private var mediaPlayer: MediaPlayer? = null

    private val handler = Handler(Looper.getMainLooper())

    companion object {
        const val CHANNEL_ID = "ALARM_CHANNEL"
        const val NOTIFICATION_ID = 1001
        const val ACTION_STOP_ALARM = "STOP_ALARM"
    }

    override fun onCreate() {
        super.onCreate()

        createNotificationChannel()
    }

    override fun onStartCommand(
        intent: Intent?,
        flags: Int,
        startId: Int
    ): Int {

        // If STOP button was pressed
        if (intent?.action == ACTION_STOP_ALARM) {
            stopAlarm()
            return START_NOT_STICKY
        }

        // Create notification
        val notification = createNotification()

        // Start foreground service
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {

            startForeground(
                NOTIFICATION_ID,
                notification,
                ServiceInfo.FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK
            )

        } else {

            startForeground(
                NOTIFICATION_ID,
                notification
            )
        }

        // Start alarm sound
        startAlarmSound()

        // Stop automatically after 5 minutes
        handler.removeCallbacksAndMessages(null)

        handler.postDelayed({

            stopAlarm()

        }, 5 * 60 * 1000L)

        return START_NOT_STICKY
    }

    private fun startAlarmSound() {

        // Release previous player if it exists
        mediaPlayer?.release()
        mediaPlayer = null

        mediaPlayer = MediaPlayer.create(
            this,
            R.raw.alarm
        )

        if (mediaPlayer != null) {

            mediaPlayer?.isLooping = true

            mediaPlayer?.setOnErrorListener { _, _, _ ->

                stopAlarm()

                true
            }

            mediaPlayer?.start()
        }
    }

    private fun stopAlarm() {

        handler.removeCallbacksAndMessages(null)

        mediaPlayer?.let {

            if (it.isPlaying) {
                it.stop()
            }

            it.release()
        }

        mediaPlayer = null

        stopForeground(STOP_FOREGROUND_REMOVE)

        stopSelf()
    }

    private fun createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val channel = NotificationChannel(
                CHANNEL_ID,
                "Alarm",
                NotificationManager.IMPORTANCE_HIGH
            )

            channel.description = "Alarm notification"

            val manager =
                getSystemService(NotificationManager::class.java)

            manager.createNotificationChannel(channel)
        }
    }

    private fun createNotification(): Notification {

        // STOP ALARM intent
        val stopIntent = Intent(
            this,
            AlarmService::class.java
        ).apply {
            action = ACTION_STOP_ALARM
        }

        val stopPendingIntent = PendingIntent.getService(
            this,
            200,
            stopIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or
                    PendingIntent.FLAG_IMMUTABLE
        )

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            Notification.Builder(
                this,
                CHANNEL_ID
            )
                .setContentTitle("⏰ Alarm is ringing")
                .setContentText("Your alarm is playing")
                .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
                .setOngoing(true)
                .setCategory(Notification.CATEGORY_ALARM)
                .addAction(
                    Notification.Action.Builder(
                        null,
                        "STOP ALARM",
                        stopPendingIntent
                    ).build()
                )
                .build()

        } else {

            Notification.Builder(this)
                .setContentTitle("⏰ Alarm is ringing")
                .setContentText("Your alarm is playing")
                .setSmallIcon(android.R.drawable.ic_lock_idle_alarm)
                .setOngoing(true)
                .setCategory(Notification.CATEGORY_ALARM)
                .addAction(
                    Notification.Action.Builder(
                        null,
                        "STOP ALARM",
                        stopPendingIntent
                    ).build()
                )
                .build()
        }
    }

    override fun onDestroy() {

        handler.removeCallbacksAndMessages(null)

        mediaPlayer?.release()
        mediaPlayer = null

        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}