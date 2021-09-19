package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayGreet : AppCompatActivity() {



    companion object {
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)
        //  intent = findViewById(R.id.intent);
        val name = intent.getStringExtra(NAME_EXTRA)
        val textView: TextView = findViewById(R.id.birthdayGreet) as TextView

        textView.text = "Happy birthday\n$name!"
    }
}