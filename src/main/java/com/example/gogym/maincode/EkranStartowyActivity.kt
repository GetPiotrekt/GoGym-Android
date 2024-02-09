package com.example.gogym.maincode
// Plik: EkranStartowyActivity.kt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gogym.R

class EkranStartowyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ekran_startowy) // Ustawienie widoku na plik XML dla ekranu startowego

        // Znajdowanie przycisków za pomocą findViewById
        val rozpocznijTreningButton: Button = findViewById(R.id.rozpocznijTreningButton)
        val historiaTreningowButton: Button = findViewById(R.id.historiaTreningowButton)
        val kalkulatorBMRButton: Button = findViewById(R.id.kalkulatorBMRButton)

        // Obsługa przycisku "ROZPOCZNIJ TRENING"
        rozpocznijTreningButton.setOnClickListener {
            // Przejście do aktywności odpowiadającej za rozpoczęcie treningu
            val intent = Intent(this, RozpocznijTreningActivity::class.java)
            startActivity(intent)
        }

        // Obsługa przycisku "HISTORIA TRENINGÓW"
        historiaTreningowButton.setOnClickListener {
            // Przejście do aktywności odpowiadającej za historię treningów
            val intent = Intent(this, HistoriaTreningowActivity::class.java)
            startActivity(intent)
        }

        // Obsługa przycisku "KALKULATOR BMR"
        kalkulatorBMRButton.setOnClickListener {
            // Przejście do aktywności odpowiadającej za kalkulator BMR
            val intent = Intent(this, KalkulatorBMRActivity::class.java)
            startActivity(intent)
        }
    }
}
