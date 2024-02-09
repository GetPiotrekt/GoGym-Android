/*package com.example.gogym.bazadanych

import com.example.gogym.bazadanych.entity.DaneEntity
import com.example.gogym.bazadanych.entity.TreningEntity

object DatabaseInitializer {
    suspend fun initializeDatabase(treningDao: TreningDao, daneDao: DaneDao) {
        val sampleTrainings = listOf(
            TreningEntity(1, "Trening siłowy", "2024-02-07", 60, "1, 2"),
            TreningEntity(2, "Bieganie", "2024-02-08", 30, "1"),
            // ... dodaj więcej przykładowych treningów
        )

        val sampleDane = listOf(
            DaneEntity(1, 1, 50.0f, 3, 12.0f, "00:45:00"),
            DaneEntity(2, 2, 0.0f, 0, 0.0f, "00:20:00"),
            // ... dodaj więcej przykładowych danych
        )

        treningDao.insertSampleTrainings(sampleTrainings)
        daneDao.insertSampleDane(sampleDane)
    }
}*/