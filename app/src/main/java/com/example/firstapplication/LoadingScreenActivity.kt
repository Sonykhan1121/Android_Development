package com.example.firstapplication

import android.R
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapplication.databinding.ActivityLoadingScreenBinding
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.ChasingDots
import com.github.ybq.android.spinkit.style.DoubleBounce


class LoadingScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoadingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val doubleBounce: Sprite = ChasingDots()
        binding.spinKit.setIndeterminateDrawable(doubleBounce)


    }
}
