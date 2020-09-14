package com.example.curriculumvitae

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        loadUrl()

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(url: String){
        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.settings.builtInZoomControls = true
        webView.loadUrl(url)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun loadUrl(){
        val intent = getIntent()
        val url: String? = intent.getStringExtra("link")
        webViewSetup(url?:"https://www.google.com")

    }
}