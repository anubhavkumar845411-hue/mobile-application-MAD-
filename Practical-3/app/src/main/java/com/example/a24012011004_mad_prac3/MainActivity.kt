package com.example.a24012011004_mad_prac3
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        implictindent()
        explecitindent()
    }
    fun implictindent(){
        findViewById<Button>(R.id.btnbrowse).setOnClickListener {
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse(findViewById<EditText>(R.id.editTextText).text.toString() )
            ).also {startActivity(it)}
        }
        findViewById<Button>(R.id.btncall).setOnClickListener {
            val phone_no = findViewById<EditText>(R.id.editTextText2).text.toString()
            val intent  = Intent(Intent.ACTION_DIAL)
            intent.setData("tel:$phone_no".toUri())
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnalarm).setOnClickListener {
            Intent(
                AlarmClock.ACTION_SHOW_ALARMS
            ).also { startActivity(it) }
        }

        findViewById<Button>(R.id.btncamera).setOnClickListener {
            Intent(
                MediaStore.ACTION_IMAGE_CAPTURE
            ).also { startActivity(it) }
        }

        findViewById<Button>(R.id.btncalllog).setOnClickListener {
            Intent(
                Intent.ACTION_VIEW
            ).setType(CallLog.Calls.CONTENT_TYPE).apply {startActivity(this)}
        }


        findViewById<Button>(R.id.btngallary).setOnClickListener {
            Intent(
                Intent.ACTION_VIEW
            ).setType("Image/*").apply {startActivity(this)}
        }
    }

    fun explecitindent(){
        findViewById<Button>(R.id.btnlogin).setOnClickListener {
            Intent(
                this,
                LoginActivity::class.java
            ).also {
                startActivity(it)
            }
        }
    }

}