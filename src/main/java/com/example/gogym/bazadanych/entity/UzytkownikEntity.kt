package com.example.gogym.bazadanych.entity
// UzytkownikEntity.kt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Uzytkownik")
data class UzytkownikEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_Uzytkownika")
    val idUzytkownika: Int,

    @ColumnInfo(name = "Wzrost")
    val wzrost: Int,

    @ColumnInfo(name = "Waga")
    val waga: Float,

    @ColumnInfo(name = "Wiek")
    val wiek: Int,

    @ColumnInfo(name = "Plec")
    val plec: String? // Możesz dostosować typ danych w zależności od potrzeb
)
