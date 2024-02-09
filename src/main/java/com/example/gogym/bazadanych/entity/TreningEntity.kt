package com.example.gogym.bazadanych.entity
// TreningEntity.kt

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Trening")
data class TreningEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_Treningu")
    val idTreningu: Int,

    @ColumnInfo(name = "Nazwa_treningu")
    val nazwaTreningu: String,

    @ColumnInfo(name = "Data")
    val data: String,

    @ColumnInfo(name = "Czas_trwania")
    val czasTrwaniaMinuty: Int?,

    @ColumnInfo(name = "Lista_cwiczen")
    val listaCwiczen: String?
)
