package com.kluivert.superhero.data.dtbase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kluivert.superhero.R
import com.kluivert.superhero.data.dao.HeroDao
import com.kluivert.superhero.data.entities.Hero
import com.kluivert.superhero.data.entities.HeroData
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


@Database(entities = [Hero::class], version = 1, exportSchema = false)
abstract class HeroDatabase : RoomDatabase() {


    abstract fun heroDao():HeroDao


    companion object{
        @Volatile
        private var INSTANCE : HeroDatabase? = null

        fun getDatabase(context: Context):HeroDatabase{

            var tempInstance = INSTANCE
            if (tempInstance !=null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,
                HeroDatabase::class.java,
                    "hero_database"
                    ).build()
     GlobalScope.launch {
        instance.heroDao().addHero(HeroData().heroData())
    }


                INSTANCE = instance
                return instance

            }
        }


    }


}