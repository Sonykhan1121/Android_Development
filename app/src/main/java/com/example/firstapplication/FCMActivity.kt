package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapplication.databinding.ActivityFcmactivityBinding

class FCMActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFcmactivityBinding
    private var str:String =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFcmactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if(intent!=null)
        {
            if(intent.hasExtra("key1"))
            {
                for (key in intent.extras!!.keySet())
                {
                   if(key=="key1" || key=="score" || key=="over" || key=="target" )  str = str + key.toString()+" : "+intent.extras!!.getString(key).toString()+"\n"

                }
                binding.txtScore1.text = str
            }
        }
    }
}