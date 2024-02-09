package com.example.gogym.bazadanych
// MojeDao.kt

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.gogym.bazadanych.entity.CwiczenieEntity
import com.example.gogym.bazadanych.entity.TreningEntity

@Dao
interface MojeDao {
    @Insert
    fun dodajCwiczenie(cwiczenie: CwiczenieEntity)

    @Query("SELECT * FROM Cwiczenie")
    fun pobierzWszystkieCwiczenia(): List<CwiczenieEntity>

    //@Insert
    //suspend fun insertSampleTrainings(trainings: List<TreningEntity>)

    // Podobnie utwórz metody dla pozostałych encji
}

