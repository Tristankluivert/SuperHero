package com.kluivert.superhero.data.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "hero_table")
data class Hero (
    @PrimaryKey(autoGenerate = false)
    val id : Int,
    val heroName : String,
    val heroDesc : String,
    var heroImage : Int
):Parcelable