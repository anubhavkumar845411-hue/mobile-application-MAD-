package com.example.a24012011004_prac4
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import java.util.Calendar


import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent

class MainActivity : AppCompatActivity() {
    lateinit var card2: MaterialCardView
    lateinit var textAlarm: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card2 = findViewById(R.id.alarmCard2)
        textAlarm = findViewById(R.id.currentTime2)
        card2.visibility=View.GONE


        findViewById<MaterialButton>(R.id.createAlarmButton).setOnClickListener {
            showTimePicker()
        }
        findViewById<MaterialButton>(R.id.cancelAlarmButton).setOnClickListener {

            val alarmManager =
                getSystemService(Context.ALARM_SERVICE) as AlarmManager

            val intent = Intent(this, AlarmReceiver::class.java)

            val pendingIntent = PendingIntent.getBroadcast(
                this,
                100,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )

            alarmManager.cancel(pendingIntent)

            card2.visibility = View.GONE
        }
    }
    fun showTimePicker(){
        val calendar  = Calendar.getInstance()
        val hour:Int = calendar.get(Calendar.HOUR_OF_DAY)
        val min:Int = calendar.get(Calendar.MINUTE)

        val picker = TimePickerDialog(
            this,
            {tp,h,m->startStopAlarm(h,m)},
            hour,
            min,
            false
        )
        picker.show()
    }
    fun startStopAlarm(h: Int, m: Int) {

        // Show the second card
        card2.visibility = View.VISIBLE

        // Display selected time
        textAlarm.text = String.format("%02d:%02d", h, m)

        // Create calendar for selected time
        val calendar = Calendar.getInstance()

        calendar.set(Calendar.HOUR_OF_DAY, h)
        calendar.set(Calendar.MINUTE, m)
        calendar.set(Calendar.SECOND, 0)
        calendar.set(Calendar.MILLISECOND, 0)

        // If selected time has already passed,
        // schedule it for tomorrow
        if (calendar.timeInMillis <= System.currentTimeMillis()) {
            calendar.add(Calendar.DAY_OF_YEAR, 1)
        }

        val alarmManager =
            getSystemService(Context.ALARM_SERVICE) as AlarmManager

        val intent = Intent(this, AlarmReceiver::class.java)

        val pendingIntent = PendingIntent.getBroadcast(
            this,
            100,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or
                    PendingIntent.FLAG_IMMUTABLE
        )

        // Check exact alarm permission
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {

            if (alarmManager.canScheduleExactAlarms()) {

                alarmManager.setExactAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP,
                    calendar.timeInMillis,
                    pendingIntent
                )

            } else {

                val settingsIntent = Intent(
                    android.provider.Settings.ACTION_REQUEST_SCHEDULE_EXACT_ALARM
                )

                startActivity(settingsIntent)
            }

        } else {

            alarmManager.setExactAndAllowWhileIdle(
                AlarmManager.RTC_WAKEUP,
                calendar.timeInMillis,
                pendingIntent
            )
        }
    }


}