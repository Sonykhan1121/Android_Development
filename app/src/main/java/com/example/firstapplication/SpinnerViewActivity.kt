package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class SpinnerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_view)
        var a = arrayOf("Apple🍎","Orange🍊","banana🍌","papaya🥭","watermelon🍉","grapes🍇","Anar🍋")
        val spinner = findViewById<Spinner>(R.id.spinner_id)
        var aradapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,a)
        aradapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = aradapter
        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext, "You are selected "+a[position]+"fruit.", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}