package com.example.pncht.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener({
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.putExtra("key","Kotlin")
            startActivity(intent)
        })

        btn2.setOnClickListener({
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.putExtra("key","Kotlin")
            startActivity(intent)
        })

    }
}
