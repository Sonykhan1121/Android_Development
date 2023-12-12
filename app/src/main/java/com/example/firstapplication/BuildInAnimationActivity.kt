package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.animation.AnimationUtils
import com.example.firstapplication.databinding.ActivityBuildInAnimationBinding

class BuildInAnimationActivity : AppCompatActivity(),OnClickListener {
    private lateinit var binding:ActivityBuildInAnimationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuildInAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fadeInId.setOnClickListener(this)
        binding.fadeOutId.setOnClickListener(this)
        binding.bounceId.setOnClickListener(this)
        binding.rotateId.setOnClickListener(this)
        binding.slideUpId.setOnClickListener(this)
        binding.slidedownId.setOnClickListener(this)
        binding.zoomInId.setOnClickListener(this)
        binding.zoomOutId.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
       when(v?.id)
       {
            R.id.rotate_id -> {
                val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
                binding.showtextId.startAnimation(animation)
            }
           R.id.bounce_id ->
           {
               val animation = AnimationUtils.loadAnimation(this,R.anim.bounce_an)
               binding.showtextId.startAnimation(animation)
           }
           R.id.slide_up_id ->
           {
               val animation = AnimationUtils.loadAnimation(this,R.anim.slide_up)
               binding.showtextId.startAnimation(animation)
           }
           R.id.slidedown_id ->
           {
               val animation = AnimationUtils.loadAnimation(this,R.anim.slide_down)
               binding.showtextId.startAnimation(animation)
           }
           R.id.zoom_in_id ->
           {
               val animation = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
               binding.showtextId.startAnimation(animation)
           }
           R.id.zoom_out_id ->
           {
               val animation = AnimationUtils.loadAnimation(this,R.anim.zoom_out)
               binding.showtextId.startAnimation(animation)
           }
           R.id.fade_in_id ->
           {
               val animation = AnimationUtils.loadAnimation(this,R.anim.fade_in)
               binding.showtextId.startAnimation(animation)
           }R.id.fade_out_id ->
       {
           val animation = AnimationUtils.loadAnimation(this,R.anim.fade_out)
           binding.showtextId.startAnimation(animation)
       }



       }
    }
}