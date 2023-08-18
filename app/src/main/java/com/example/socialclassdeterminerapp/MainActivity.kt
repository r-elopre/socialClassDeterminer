package com.example.socialclassdeterminerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcome : TextView = findViewById(R.id.textView)
        val enterIncome : EditText = findViewById(R.id.editText)
        val knowButton : Button = findViewById(R.id.button)


        knowButton.setOnClickListener(){

            var income = enterIncome.text

            // move to other activity
            var i = Intent(this, SocialClassActivity:: class.java)

            // passing the income
            i.putExtra("income", income)
            startActivity(i)
        }


    }
}