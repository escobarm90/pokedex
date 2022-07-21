package com.example.pokedex

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class PokeHolder(view: View): RecyclerView.ViewHolder(view){

        val pokemonName = view.findViewById<TextView>(R.id.namePokemon)
        val pokemonImage = view.findViewById<ImageView>(R.id.imagePokemon)

    fun render(pokeModel: Pokemon) {
           pokemonName.text = pokeModel.namePokemon
          Picasso.get().load(pokeModel.imagePokemon).into(pokemonImage)

        }
    }
