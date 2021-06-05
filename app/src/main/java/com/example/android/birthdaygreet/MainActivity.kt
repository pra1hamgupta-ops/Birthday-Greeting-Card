package com.example.android.birthdaygreet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonForCard.setOnClickListener{

            val name = inputName.editableText.toString()
            val intent = Intent(this, BirthdayWish::class.java)

            intent.putExtra(BirthdayWish.intentString, name)
            startActivity(intent)
        }
    }


}