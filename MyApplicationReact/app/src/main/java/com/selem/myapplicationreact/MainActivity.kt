package com.selem.myapplicationreact

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.lib.LibActivity
import com.lib.LibActivity2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<AppCompatButton>(R.id.buttom)
        button.setOnClickListener {
            val intent = Intent(this, LibActivity2::class.java)
            startActivity(intent)
        }

    }
}
