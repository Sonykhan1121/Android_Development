package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapplication.databinding.ActivityMovementofViewsBinding
import render.animations.Attention
import render.animations.Bounce
import render.animations.Render
import render.animations.Rotate

class MovementofViewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMovementofViewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovementofViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Declare TextView


// Create Render Class
        val render = Render(this)

// Set Animation
       binding.loginBtnId.setOnClickListener {
           render.setAnimation(Rotate().In(binding.insideId))
           render.start()
       }
    }
}