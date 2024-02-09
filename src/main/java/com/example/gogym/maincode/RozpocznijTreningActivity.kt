package com.example.gogym.maincode
// Plik: RozpocznijTreningActivity.kt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gogym.R

class RozpocznijTreningActivity : AppCompatActivity() {

    private lateinit var welcomeText: TextView
    private lateinit var lawkaPlaskaButton: Button
    private lateinit var martwyCiagButton: Button
    private lateinit var podciaganieButton: Button
    private lateinit var podsumowanieButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rozpocznij_trening)

        // Inicjalizacja pól i przypisanie do elementów interfejsu
        welcomeText = findViewById(R.id.welcomeText)
        lawkaPlaskaButton = findViewById(R.id.lawkaPlaskaButton)
        martwyCiagButton = findViewById(R.id.martwyCiagButton)
        podciaganieButton = findViewById(R.id.podciaganieButton)
        podsumowanieButton = findViewById(R.id.podsumowanieButton)

        // Ustawienie funkcji obsługujących przyciski
        lawkaPlaskaButton.setOnClickListener { pLawkaPlaska() }
        martwyCiagButton.setOnClickListener { pMartwyCiag() }
        podciaganieButton.setOnClickListener { pPodciaganie() }
        podsumowanieButton.setOnClickListener { pPodsumowanie() }

        // Możesz dostosować resztę interfejsu i logiki w zależności od potrzeb
    }

    // Obsługa kliknięcia przycisku Ławka Płaska
    fun pLawkaPlaska() {
        startActivityWithExerciseActivity(LawkaPlaskaActivity::class.java)
    }

    // Obsługa kliknięcia przycisku Martwy Ciąg
    fun pMartwyCiag() {
        startActivityWithExerciseActivity(MartwyCiagActivity::class.java)
    }

    // Obsługa kliknięcia przycisku Podciąganie
    fun pPodciaganie() {
        startActivityWithExerciseActivity(PodciaganieActivity::class.java)
    }

    // Obsługa kliknięcia przycisku Podsumowanie
    fun pPodsumowanie() {
        startActivityWithExerciseActivity(PodsumowanieActivity::class.java)
    }

    // Metoda pomocnicza do rozpoczęcia nowej aktywności związanej z ćwiczeniem
    private fun startActivityWithExerciseActivity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}
