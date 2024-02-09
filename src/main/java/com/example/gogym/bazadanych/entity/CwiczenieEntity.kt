package com.example.gogym.bazadanych.entity
// CwiczenieEntity.kt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Cwiczenie")
data class CwiczenieEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_Cwiczenia")
    val idCwiczenia: Int = 0,

    @ColumnInfo(name = "Nazwa_cwiczenia")
    val nazwaCwiczenia: String,

    @ColumnInfo(name = "Tresc")
    val tresc: String,

    @ColumnInfo(name = "Jaki_chwyt")
    val jakiChwyt: String? = null,

    @ColumnInfo(name = "Jaki_sprzet")
    val jakiSprzet: String? = null,

    @ColumnInfo(name = "Jaki_uchwyt")
    val jakiUchwyt: String? = null
)

// Podobnie utwórz klasy encji dla pozostałych tabel (Dane, Trening, Uzytkownik)

