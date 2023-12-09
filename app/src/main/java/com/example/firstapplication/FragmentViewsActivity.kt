package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.firstapplication.databinding.ActivityFragmentViewsBinding

class FragmentViewsActivity : AppCompatActivity() {
    lateinit var binding: ActivityFragmentViewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.frBtn1.setOnClickListener {
           var manager = supportFragmentManager
           var tr = manager.beginTransaction()
           tr.replace(R.id.frame,FirstFragment())
           tr.commit()
       }
        binding.frBtn2.setOnClickListener {
            var manager = supportFragmentManager
            var tr = manager.beginTransaction()
            tr.replace(R.id.frame,SecondFragment())
            tr.commit()
        }
    }
}