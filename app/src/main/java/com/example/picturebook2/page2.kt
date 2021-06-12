package com.example.picturebook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        var btnnext2=findViewById<Button>(R.id.btnnext2)
        var btnprevious1=findViewById<Button>(R.id.btnprevious1)
        var tvbook=findViewById<TextView>(R.id.tvbook)
        btnnext2.setOnClickListener {
        var intent= Intent(baseContext,page3::class.java)
        startActivity(intent)
    }
        btnprevious1.setOnClickListener {
         var intent=Intent(baseContext,MainActivity::class.java)
         startActivity(intent)
        }

}
}