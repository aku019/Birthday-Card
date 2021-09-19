package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.R.attr.name
import android.content.Intent
import android.widget.EditText







class MainActivity : AppCompatActivity() {
    var editTextPersonName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextPersonName = findViewById(R.id.editTextPersonName);



    }

    fun createBirthdayCard(view: View) {
        val content: String = editTextPersonName?.getText().toString()
      // val name = (findViewById(R.id.editTextPersonName))//.editableText.toString()
      //  Toast.makeText(this, "Name is $content", Toast.LENGTH_LONG).show()
        val intent = Intent(this, BirthdayGreet::class.java)
        intent.putExtra(BirthdayGreet.NAME_EXTRA,content)
        startActivity(intent)
    }


}