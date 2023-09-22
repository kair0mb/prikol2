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
        val lemonButton: Button = findViewById(R.id.lemonbut)
        val bananaImage: ImageView = findViewById(R.id.Bananaimg)
        val lemonImage: ImageView = findViewById(R.id.lemonimg)

        // Устанавливаем обработчик нажатия на кнопку для бананов
        bananaButton.setOnClickListener {
            // При нажатии кнопки, делаем изображение банана видимым, а изображение лимона - невидимым
            bananaImage.visibility = View.VISIBLE
            lemonImage.visibility = View.INVISIBLE
        }

        // Устанавливаем обработчик нажатия на кнопку для лимонов
        lemonButton.setOnClickListener {
            // При нажатии кнопки, делаем изображение лимона видимым, а изображение банана - невидимым
            lemonImage.visibility = View.VISIBLE
            bananaImage.visibility = View.INVISIBLE
        }
    }
}