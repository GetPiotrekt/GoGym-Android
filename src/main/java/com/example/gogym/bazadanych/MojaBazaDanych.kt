package com.example.gogym.bazadanych
// MojaBazaDanych.kt

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.gogym.bazadanych.entity.CwiczenieEntity
import com.example.gogym.bazadanych.entity.DaneEntity
import com.example.gogym.bazadanych.entity.TreningEntity
import com.example.gogym.bazadanych.entity.UzytkownikEntity

@Database(entities = [CwiczenieEntity::class, DaneEntity::class, TreningEntity::class, UzytkownikEntity::class], version = 1)
abstract class MojaBazaDanych : RoomDatabase() {
    abstract fun mojeDao(): MojeDao
}