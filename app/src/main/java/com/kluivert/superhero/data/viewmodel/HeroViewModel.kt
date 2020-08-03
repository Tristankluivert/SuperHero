package com.kluivert.superhero.data.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.kluivert.superhero.data.dao.HeroDao
import com.kluivert.superhero.data.dtbase.HeroDatabase
import com.kluivert.superhero.data.entities.Hero
import com.kluivert.superhero.data.entities.HeroData
import com.kluivert.superhero.data.repository.HeroRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HeroViewModel (application: Application) : AndroidViewModel(application){

    val readHero : LiveData<List<Hero>>
     private val heroRepository : HeroRepository
  

    init {

        val heroDao = HeroDatabase.getDatabase(application).heroDao()
        heroRepository = HeroRepository(heroDao)
        readHero = heroRepository.readHero
       

    }

    fun addHero(hero: Array<Hero>){
       viewModelScope.launch(Dispatchers.IO) {
           heroRepository.addHero(hero)
       }
    }

}