package com.example.kotlinapplogin

import android.os.Bundle
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
        val intent = Intent(this,thirdActivity::class.java)   //화면전환
    }
}