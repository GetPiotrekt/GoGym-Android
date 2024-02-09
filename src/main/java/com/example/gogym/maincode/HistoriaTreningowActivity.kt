package com.example.gogym.maincode
// Plik: HistoriaTreningowActivity.kt

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gogym.R

class HistoriaTreningowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.historia_treningow)

        val cofnijButton: Button = findViewById(R.id.cofnijButton)

        cofnijButton.setOnClickListener {
            // Przejście do poprzedniej aktywności (lub ekranu)
            onBackPressed()
        }
    }
}
