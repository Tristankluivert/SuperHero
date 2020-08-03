package com.kluivert.superhero.data.repository

import androidx.lifecycle.LiveData
import com.kluivert.superhero.data.dao.HeroDao
import com.kluivert.superhero.data.entities.Hero

class HeroRepository( var heroDao: HeroDao) {

    val readHero : LiveData<List<Hero>> = heroDao.readHero()


    suspend fun addHero(hero: Array<Hero>){
        heroDao.addHero(hero)
    }

}