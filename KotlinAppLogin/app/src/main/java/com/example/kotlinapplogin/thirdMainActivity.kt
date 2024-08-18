package com.example.kotlinapplogin

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecoundMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secound_main)

        val tvId2 = findViewById<TextView>(R.id.tv_id2)

        if (intent.hasExtra("WMI")) {
            val wmiValue = intent.getStringExtra("WMI")
            tvId2.text = "$wmiValue 님 환영합니다" // 값이 넘어옴

        }
        web_V.settings.javaScriptEnabled = true //웹에서 javascript로 되어 있는 부분을 허용
        web_V.webViewClient = WebViewClient()   //새로운 웹창이 못뜨게, 폰에서도
        web_V.webChromeClient = WebChromeClient()
        //접속할 url 주소
        web_V.loadUrl(intent)

    }
}