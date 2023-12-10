package com.example.firstapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.firstapplication.databinding.ActivityImplicitIntentViewBinding

class ImplicitIntentViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImplicitIntentViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitIntentViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.openwebpageId.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Sonykhan1121"))
            startActivity(intent)
        }
        binding.PhoneCallId.setOnClickListener {
    var intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+8801871787348")
            startActivity(intent)
        }
        binding.cameraId.setOnClickListener {
            var intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        binding.ShareTxtId.setOnClickListener {
            val text:String = binding.textId.text.toString()
            var intent  = Intent(Intent.ACTION_SEND)
            intent.type  = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,text)
            startActivity(Intent.createChooser(intent,"Share Via"))

        }
    }
}