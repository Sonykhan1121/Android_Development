package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.firstapplication.databinding.ActivityRegistrationHomeBinding

class RegistrationHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registration_home)
        val txt1 = findViewById<TextView>(R.id.name_home)
        val txt2 = findViewById<TextView>(R.id.father_id_home)
        val txt3 = findViewById<TextView>(R.id.phone_id)
        val txt4 = findViewById<TextView>(R.id.roll_id_home)
       val intent = intent

        val name: String? = intent.getStringExtra("name")
        val fatherName:String? = intent.getStringExtra("fatherName")
        val phone:String? = intent.getStringExtra("phone")
        val roll:String? = intent.getStringExtra("roll")

        if(name==null)
        {
            Toast.makeText(this, "Not getting the data", Toast.LENGTH_SHORT).show()
        }
        txt1.text = "Hello , $name"
        txt2.text = "Your father : $fatherName"
        txt3.text = "Contact : $phone"
        txt4.text = "Roll No. $roll"



    }
}