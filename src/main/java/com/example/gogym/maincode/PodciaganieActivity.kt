package com.example.gogym.maincode
// Plik: PodciaganieActivity.kt

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gogym.R

class PodciaganieActivity : AppCompatActivity() {

    private lateinit var aktualnaWagaField: EditText
    private lateinit var aktualnyCiezarField: EditText
    private lateinit var iloscPowtorzenField: EditText
    private lateinit var numerSeriiLabel: TextView
    private lateinit var infoLabel: TextView

    private var numerSerii: Int = 1
    private var objetosc: Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.podciaganie)

        // Inicjalizacja pól i przypisanie do elementów interfejsu
        aktualnaWagaField = findViewById(R.id.aktualnaWagaField)
        aktualnyCiezarField = findViewById(R.id.aktualnyCiezarField)
        iloscPowtorzenField = findViewById(R.id.iloscPowtorzenField)
        numerSeriiLabel = findViewById(R.id.numerSeriiLabel)
        infoLabel = findViewById(R.id.infoLabel)

        // Przypisanie funkcji obsługującej przycisk do kliknięcia
        val podciaganieButton: Button = findViewById(R.id.cwiczeDalejButton)
        podciaganieButton.setOnClickListener { podciaganie() }

        val zmieniamCwiczenieButton: Button = findViewById(R.id.zmieniamCwiczenieButton)
        zmieniamCwiczenieButton.setOnClickListener { onBackPressed() }
    }

    private fun podciaganie() {
        try {
            // Pobieranie wartości z pól tekstowych
            val aktualnaWaga: Float = aktualnaWagaField.text.toString().toFloat()
            val aktualnyCiezar: Float = aktualnyCiezarField.text.toString().toFloat()
            val iloscPowtorzen: Int = iloscPowtorzenField.text.toString().toInt()

            objetosc += aktualnaWaga + (aktualnyCiezar * iloscPowtorzen)

            numerSeriiLabel.text = "NUMER SERII: $numerSerii\nAKTUALNA OBJETOŚĆ TRENINGOWA: $objetosc"
            numerSerii++

            infoLabel.text = "Wpisz dane dla kolejnej serii."
        } catch (e: NumberFormatException) {
            // Obsługa błędów związanych z nieprawidłowym formatem liczbowym
            infoLabel.text = "Wprowadź poprawne dane liczbowe."
        } catch (e: Exception) {
            // Obsługa innych wyjątków
            e.printStackTrace()
        }
    }
}
