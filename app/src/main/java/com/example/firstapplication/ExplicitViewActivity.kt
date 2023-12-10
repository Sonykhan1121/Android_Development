package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.firstapplication.databinding.ActivityExplicitViewBinding


class ExplicitViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_view)

        val Name:EditText = findViewById<EditText>(R.id.name_id_regis)
        val FatherName:EditText = findViewById<EditText>(R.id.father_name_id_regis)
        val Number:EditText = findViewById<EditText>(R.id.phone_id_regis)
        val Roll:EditText = findViewById<EditText>(R.id.roll_id_regis)
        val btn11 = findViewById<Button>(R.id.btn_regis)


        btn11.setOnClickListener {
            val name:String = Name.text.toString()

            val fathername:String = FatherName.text.toString()
            val number:String = Number.text.toString()
            val roll:String = Roll.text.toString()

            intent = Intent(this,RegistrationHomeActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("fatherName",fathername)
            intent.putExtra("phone",number)
            intent.putExtra("roll",roll)
            startActivity(intent)
        }



    }
}