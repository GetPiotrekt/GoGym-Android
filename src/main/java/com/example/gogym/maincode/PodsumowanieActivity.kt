package com.example.gogym.maincode
// Plik: PodsumowanieActivity.kt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gogym.R

class PodsumowanieActivity : AppCompatActivity() {

    private lateinit var welcomeText: TextView
    private lateinit var infoLabel: TextView
    private lateinit var congratulationsMessage: TextView
    private lateinit var powrotButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.podsumowanie)

        // Inicjalizacja pól i przypisanie do elementów interfejsu
        welcomeText = findViewById(R.id.welcomeText)
        infoLabel = findViewById(R.id.infoLabel)
        congratulationsMessage = findViewById(R.id.congratulationsMessage)
        powrotButton = findViewById(R.id.powrotButton)

        // Przypisanie funkcji obsługującej przycisk do kliknięcia
        powrotButton.setOnClickListener { powrotDoEkranuGlownego() }

        // Możesz dostosować resztę interfejsu i logiki w zależności od potrzeb
    }

    private fun powrotDoEkranuGlownego() {
        // Tutaj dodaj logikę przechodzenia do ekranu głównego lub innej aktywności
        // Na przykład:
        val intent = Intent(this, EkranStartowyActivity::class.java)
        startActivity(intent)
    }
}

