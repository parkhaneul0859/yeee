package com.example.kotlinapplogin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        bt_login.setClickListener(){
            //Intent 화면전화 key->volue/ id->id
            //var 일반전, 변하는 변수 / val 선언사에만 초기화 중간에 값변경 안됨.변화지 말아야할 값
            val intent = Intent(this,SecoundActivity::class.java)   //화면전환
            //id가 다음화면에 보여야 됨
            intent.putExtra(name:"WMI", ed_Id.text.toString())  //key=WMI, volue=ed_id.text
            startActivity(intent)
    }
}