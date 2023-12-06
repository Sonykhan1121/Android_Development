package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import com.thecode.aestheticdialogs.AestheticDialog
import com.thecode.aestheticdialogs.DialogAnimation
import com.thecode.aestheticdialogs.DialogStyle
import com.thecode.aestheticdialogs.DialogType
import com.thecode.aestheticdialogs.OnDialogClickListener

class CustomAlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog)
        val firstbtn = findViewById<Button>(R.id.loadingbtn)
        val secondbtn = findViewById<Button>(R.id.warningbtn)
        val thirdbtn = findViewById<Button>(R.id.successbtn)
        firstbtn.setOnClickListener {
            AestheticDialog.Builder(this, DialogStyle.FLAT, DialogType.ERROR)
                .setTitle("Load")
                .setMessage("Task is loading")
                .setCancelable(false)
                .setDarkMode(true)
                .setGravity(Gravity.CENTER)
                .setAnimation(DialogAnimation.SHRINK)
                .setOnClickListener(object : OnDialogClickListener {
                    override fun onClick(dialog: AestheticDialog.Builder) {
                        dialog.dismiss()
                        //actions...
                    }
                })
                .show()
        }
        secondbtn.setOnClickListener {
            AestheticDialog.Builder(this, DialogStyle.EMOTION, DialogType.ERROR)
                .setTitle("Warning")
                .setMessage("This can be hurtful")
                .show()
        }
        thirdbtn.setOnClickListener {
            AestheticDialog.Builder(this, DialogStyle.RAINBOW, DialogType.SUCCESS)
                .setTitle("Success")
                .setMessage("You will be successful")
                .setCancelable(false)
                .setDarkMode(true)
                .setGravity(Gravity.CENTER)
                .setAnimation(DialogAnimation.SHRINK)
                .setOnClickListener(object : OnDialogClickListener {
                    override fun onClick(dialog: AestheticDialog.Builder) {
                        dialog.dismiss()
                        //actions...
                    }
                })
                .show()
        }

    }
}