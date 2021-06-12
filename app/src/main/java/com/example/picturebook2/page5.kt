package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class page5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)


        var btnprevious4=findViewById<Button>(R.id.btnprevious4)
        var tvjar2=findViewById<TextView>(R.id.tvjar2)


        btnprevious4.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }


    }
}