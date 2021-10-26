package com.HGCB.FindingGraceGriffen.android

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.HGCB.FindingGraceGriffen.Greeting
import android.widget.TextView
import org.w3c.dom.Text

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv: TextView = findViewById(R.id.wText)
        tv.text = "Finding Grace"
        val loginButtonClick = findViewById(R.id.button) as Button
        loginButtonClick.setOnClickListener {
            val textInputEditText = findViewById<EditText>(R.id.editTextTextEmail).text
            val passwordInputEditText = findViewById<EditText>(R.id.editTextTextPassword).text

        }


    }
}
