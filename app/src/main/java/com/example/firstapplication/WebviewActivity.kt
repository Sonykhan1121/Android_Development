package com.example.firstapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.firstapplication.databinding.ActivityWebviewBinding

class WebviewActivity : AppCompatActivity() {
    lateinit var binding: ActivityWebviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebviewBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.website.loadUrl("https://leetcode.com/")
        binding.website.settings.javaScriptEnabled = true
        binding.website.webViewClient = WebViewClient()
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // Check whether the key event is the Back button and if there's history.
        if (keyCode == KeyEvent.KEYCODE_BACK && binding.website.canGoBack()) {
            binding.website.goBack()
            return true
        }
        // If it isn't the Back button or there isn't web page history, bubble up to
        // the default system behavior. Probably exit the activity.
        return super.onKeyDown(keyCode, event)
    }
}