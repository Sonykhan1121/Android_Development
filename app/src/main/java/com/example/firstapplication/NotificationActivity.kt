package com.example.firstapplication

import android.app.NotificationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.content.getSystemService
import com.example.firstapplication.databinding.ActivityNotificationBinding

class NotificationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.highPrBtn.setOnClickListener {
            val notification = NotificationCompat.Builder(this, App().CHANNEL_ID1)
                .setContentTitle(binding.titleNtId.text.toString())
                .setContentText(binding.desNtId.text.toString())
                .setSmallIcon(R.drawable.popup)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .build()

            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(1, notification)
        }

        binding.lowPrBtn.setOnClickListener {
            val notification = NotificationCompat.Builder(this, App().CHANNEL_ID2)
                .setContentTitle(binding.titleNtId.text.toString())
                .setContentText(binding.desNtId.text.toString())
                .setSmallIcon(R.drawable.notification)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .build()

            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(2, notification)
        }
    }
}
