package com.example.pokedex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Adapter(val pokemons:List<Pokemon>):RecyclerView.Adapter<Adapter.PokeHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PokeHolder(layoutInflater.inflate(R.layout.item_pokemon_list,parent,false))

    }


    override fun getItemCount(): Int = pokemons.size

    override fun onBindViewHolder(holder: PokeHolder, position: Int) {
        holder.render(pokemons[position])
    }



    class PokeHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(pokemon: Pokemon){
            view.pokemonName.text = pokemon.pokemonName
            Picasso.get().load

        }

    }


}
