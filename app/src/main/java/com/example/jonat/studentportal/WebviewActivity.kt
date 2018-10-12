package com.example.jonat.studentportal

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import com.example.jonat.studentportal.R.id.toolbar
import kotlinx.android.synthetic.main.activity_main.*

class WebviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.webview)

        var currentUrl = intent.getStringExtra(CustomViewHolder.URL_KEY)

        val myWebView : WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl(currentUrl)

    }
}