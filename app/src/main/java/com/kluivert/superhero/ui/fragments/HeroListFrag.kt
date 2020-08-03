package com.kluivert.superhero.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.kluivert.superhero.R
import com.kluivert.superhero.adapter.HeroAdapter
import com.kluivert.superhero.data.viewmodel.HeroViewModel
import kotlinx.android.synthetic.main.fragment_hero_list.view.*


class HeroListFrag : Fragment(R.layout.fragment_hero_list) {

    lateinit var heroViewModel: HeroViewModel



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        heroViewModel = ViewModelProvider(this).get(HeroViewModel::class.java)


        val adapter = HeroAdapter()
        view.heroRecycler.adapter = adapter
         view.heroRecycler.layoutManager = LinearLayoutManager(requireContext())

        heroViewModel.readHero.observe(viewLifecycleOwner, Observer {
                     adapter.setData(it)

        })



    }

}