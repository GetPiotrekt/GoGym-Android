package com.example.gogym.maincode
// Plik: KalkulatorBMRActivity.kt

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.gogym.R

class KalkulatorBMRActivity : AppCompatActivity() {

    private lateinit var mezczyznaRadioButton: RadioButton
    private lateinit var kobietaRadioButton: RadioButton
    private lateinit var aktualnaWagaField: TextView
    private lateinit var aktualnyWzrostField: TextView
    private lateinit var wiekField: TextView
    private lateinit var aktywnoscChoiceBox: Spinner
    private lateinit var infoLabel: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kalkulator_bmr)

        // Inicjalizacja widoków
        mezczyznaRadioButton = findViewById(R.id.mezczyznaRadioButton)
        kobietaRadioButton = findViewById(R.id.kobietaRadioButton)
        aktualnaWagaField = findViewById(R.id.aktualnaWagaField)
        aktualnyWzrostField = findViewById(R.id.aktualnyWzrostField)
        wiekField = findViewById(R.id.wiekField)
        aktywnoscChoiceBox = findViewById(R.id.aktywnoscSpinner) as Spinner
        infoLabel = findViewById(R.id.infoLabel)

        // Obsługa przycisku "Oblicz BMR"
        val obliczBMRButton: Button = findViewById(R.id.obliczBMRButton)
        obliczBMRButton.setOnClickListener {
            obliczBMR()
        }
        val cofnijButton: Button = findViewById(R.id.cofnijButton)
        cofnijButton.setOnClickListener { onBackPressed() }
    }

    private fun obliczBMR() {
        try {
            // Pobieranie danych z pól tekstowych
            val waga = aktualnaWagaField.text.toString().toDouble()
            val wzrost = aktualnyWzrostField.text.toString().toDouble()
            val wiek = wiekField.text.toString().toInt()

            // Wybieranie współczynnika aktywności
            val aktywnoscFactor = when ((aktywnoscChoiceBox.selectedItem as? String)?.trim()) {
                "Niska aktywność (ćwiczenia 1-3 razy w tygodniu)" -> 1.2
                "Średnia aktywność (ćwiczenia 3-5 razy w tygodniu)" -> 1.375
                "Wysoka aktywność (ćwiczenia codziennie)" -> 1.55
                "Bardzo wysoka aktywność (ćwiczenia kilka razy dziennie)" -> 1.725
                else -> 1.0 // Brak aktywności fizycznej
            }

            // Obliczanie BMR w zależności od płci
            val bmr: Double = when {
                mezczyznaRadioButton.isChecked -> (10 * waga) + (6.25 * wzrost) - (5 * wiek) + 5
                kobietaRadioButton.isChecked -> (10 * waga) + (6.25 * wzrost) - (5 * wiek) - 161
                else -> {
                    infoLabel.text = "Wybierz płeć przed obliczeniem BMR."
                    return
                }
            }

            // Obliczanie BMR z uwzględnieniem aktywności
            val bmrAktywnosc = bmr * aktywnoscFactor

            // Wyświetlanie wyniku
            infoLabel.text = "Twoje BMR z uwzględnieniem aktywności wynosi:\n$bmrAktywnosc"

        } catch (e: NumberFormatException) {
            infoLabel.text = "Wprowadź poprawne dane liczbowe."
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
