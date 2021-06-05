package com.example.android.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_wish.*


class BirthdayWish : AppCompatActivity() {
    companion object{
        const val intentString = "intentString"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_wish)
        val name = intent.getStringExtra(intentString)
        wishText.text = "Happy Birthday \n $name!"
    }

}