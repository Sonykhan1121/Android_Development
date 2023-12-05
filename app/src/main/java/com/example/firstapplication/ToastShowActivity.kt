package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import com.shashank.sony.fancytoastlib.FancyToast

class ToastShowActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_show)
        val btn1 = findViewById<Button>(R.id.default_btn)
        val btn2 = findViewById<Button>(R.id.Success_btn)
        val btn3 = findViewById<Button>(R.id.Info_btn)
        val btn4 = findViewById<Button>(R.id.normal_btn)
        val btn5 = findViewById<Button>(R.id.warning_btn)
        val btn6 = findViewById<Button>(R.id.error_btn)
        val btn7 = findViewById<Button>(R.id.confusion_btn)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.default_btn -> FancyToast.makeText(this,"Hello I am Default design!",FancyToast.LENGTH_SHORT,FancyToast.DEFAULT,false).show()
            R.id.Success_btn ->FancyToast.makeText(this,"Hello I am Success !",FancyToast.LENGTH_SHORT,FancyToast.SUCCESS,false).show()
            R.id.Info_btn -> FancyToast.makeText(this,"Hello I am Info !",FancyToast.LENGTH_SHORT,FancyToast.INFO,false).show()
            R.id.normal_btn ->Toast.makeText(this, "Basic Toast from Android Studio !", Toast.LENGTH_SHORT).show()
             R.id.warning_btn -> FancyToast.makeText(this,"Hello I am warning",FancyToast.LENGTH_SHORT,FancyToast.WARNING,false).show()
             R.id.error_btn ->FancyToast.makeText(this,"Hello I am error !",FancyToast.LENGTH_SHORT,FancyToast.ERROR,false).show()
             R.id.confusion_btn ->FancyToast.makeText(this,"Hello I am confused !",FancyToast.LENGTH_SHORT,FancyToast.CONFUSING,false).show()
            else -> Toast.makeText(this, "Nothing is Working here.", Toast.LENGTH_SHORT).show()
        }
    }
}