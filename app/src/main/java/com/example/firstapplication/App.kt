package com.example.firstapplication

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.os.Build
import android.provider.Settings

class App:Application() {
    final public val CHANNEL_ID1 = "CHANNEL_ID1"
    final public val CHANNEL_ID2 = "CHANNEL_ID2"
    override fun onCreate() {
        super.onCreate()
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {

            val channel1 = NotificationChannel(CHANNEL_ID1,
                "High",NotificationManager.IMPORTANCE_HIGH)
            channel1.description = "This is my high importance channel for notification"
            val channel2 = NotificationChannel(CHANNEL_ID2,
                "Low",NotificationManager.IMPORTANCE_LOW)
            channel2.description = "This is my Low importance channel for notification"
            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager


            manager.createNotificationChannel(channel1)
            manager.createNotificationChannel(channel2)


        }
    }
}