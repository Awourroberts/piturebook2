package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        var btnnext3=findViewById<Button>(R.id.btnnext3)
        var  btnprevious2=findViewById<Button>(R.id.btnprevious2)
        var tvbook=findViewById<TextView>(R.id.tvbook)
        btnnext3.setOnClickListener {
            var intent= Intent(baseContext,page4::class.java)
            startActivity(intent)
        }
        btnprevious2.setOnClickListener {
            var intent=Intent(baseContext,page2::class.java)
           startActivity(intent)
        }

    }
}