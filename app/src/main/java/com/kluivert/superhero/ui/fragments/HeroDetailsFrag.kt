package com.kluivert.superhero.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.kluivert.superhero.R
import com.kluivert.superhero.data.viewmodel.HeroViewModel
import kotlinx.android.synthetic.main.fragment_hero_details.view.*

class HeroDetailsFrag : Fragment(R.layout.fragment_hero_details) {


    lateinit var heroViewModel: HeroViewModel
    private val hargs by navArgs<HeroDetailsFragArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        heroViewModel = ViewModelProvider(this).get(HeroViewModel::class.java)

        view.tvDetailsName.text = hargs.HeroArgs.heroName
        view.tvDetailsInfo.text = hargs.HeroArgs.heroDesc
        view.imgDetails.setImageResource(hargs.HeroArgs.heroImage)

    }

}