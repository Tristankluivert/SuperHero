package com.kluivert.superhero.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kluivert.superhero.R
import com.kluivert.superhero.data.entities.Hero
import com.kluivert.superhero.data.entities.HeroData
import com.kluivert.superhero.ui.fragments.HeroListFragDirections
import kotlinx.android.synthetic.main.hero_item.view.*

class HeroAdapter(

    var hero : List<Hero> = emptyList()

) : RecyclerView.Adapter<HeroAdapter.HeroAdapterViewHolder>(){

    inner class HeroAdapterViewHolder(itemView : View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.hero_item,parent,false)
        return HeroAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
       return hero.size
    }

    override fun onBindViewHolder(holder: HeroAdapterViewHolder, position: Int) {

        holder.itemView.apply {
            val current = hero[position]
            //imgHero.setBackgroundResource(current.heroImage)
            tvHeroName.text = current.heroName
            tvHeroInfo.text = current.heroDesc


            Glide
                .with(context.applicationContext)
                .load(current.heroImage)
                .centerCrop()
                .into(imgHero);


            hero_item_list.setOnClickListener {
                val action = HeroListFragDirections.actionHeroListFragToHeroDetailsFrag(current)
                findNavController().navigate(action)

            }
        }

    }

    fun setData(hero: List<Hero>){
        this.hero = hero
        notifyDataSetChanged()
    }
}