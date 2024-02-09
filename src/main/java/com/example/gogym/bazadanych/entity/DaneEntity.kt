package com.example.gogym.bazadanych.entity
// DaneEntity.kt

import androidx.annotation.Nullable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "Dane", foreignKeys = [ForeignKey(entity = CwiczenieEntity::class, parentColumns = ["ID_Cwiczenia"], childColumns = ["ID_Cwiczenia"], onDelete = ForeignKey.CASCADE)])
data class DaneEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_Danych")
    val idDanych: Int,

    @ColumnInfo(name = "ID_Cwiczenia")
    @Nullable
    val idCwiczenia: Int?,

    @ColumnInfo(name = "Ciezar")
    val ciezar: Float,

    @ColumnInfo(name = "Numer_serii")
    @Nullable
    val numerSerii: Int?,

    @ColumnInfo(name = "Ilosc_powtorzen")
    val iloscPowtorzen: Float,

    @ColumnInfo(name = "Czas_cwiczenia")
    @Nullable
    val czasCwiczenia: String?
)


