package com.kluivert.superhero.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kluivert.superhero.data.entities.Hero

@Dao
interface HeroDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
   suspend fun addHero(hero: Array<Hero>)

    @Query("SELECT * FROM hero_table ORDER BY id ASC")
    fun readHero() : LiveData<List<Hero>>

}