package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DogRecipe3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_recipe3)

        val backButton: ImageView = findViewById(R.id.BackRed3  )
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}