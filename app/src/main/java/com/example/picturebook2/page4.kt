package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)


        var btnnext4 = findViewById<Button>(R.id.btnnext4)
        var btnprevious3 = findViewById<Button>(R.id.btnprevious3)
        var tvcar= findViewById<TextView>(R.id.tvcar)


        btnnext4.setOnClickListener {
            var intent = Intent(baseContext, page5::class.java)
            startActivity(intent)

        }
        btnprevious3.setOnClickListener {
            var intent = Intent(baseContext, page3::class.java)
            startActivity(intent)
        }
    }

}