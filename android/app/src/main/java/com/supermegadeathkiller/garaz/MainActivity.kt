package com.supermegadeathkiller.garaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userAccessKey = findViewById(R.id.access_key_id) as EditText
        var secretKey = findViewById(R.id.secret) as EditText

        var submit = findViewById(R.id.login_button) as Button

        submit.setOnClickListener {

        }
    }
}
