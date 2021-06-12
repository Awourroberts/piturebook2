package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnnext1=findViewById<Button>(R.id.btnnext1)
        var tvbag=findViewById<TextView>(R.id.tvbag)


        btnnext1.setOnClickListener {
            var intent= Intent(baseContext,page2::class.java)
            startActivity(intent)
        }
    }
}