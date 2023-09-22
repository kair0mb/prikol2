package com.example.prikol2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bananaButton: Button = findViewById(R.id.bananabut)
        val bananaImage: ImageView = findViewById(R.id.Bananaimg)

        bananaButton.setOnClickListener {

            bananaImage.visibility = View.VISIBLE
        }
    }
}