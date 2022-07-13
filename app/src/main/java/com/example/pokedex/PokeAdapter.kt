package com.example.pokedex


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.ActionBarPolicy.get
import androidx.lifecycle.ViewTreeViewModelStoreOwner.get
import androidx.recyclerview.widget.RecyclerView
import androidx.savedstate.ViewTreeSavedStateRegistryOwner.get
import com.squareup.picasso.Picasso



class PokeAdapter(val pokemon:List<Pokemon>):RecyclerView.Adapter<PokeAdapter.PokeHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return PokeHolder(layoutInflater.inflate(R.layout.item_pokemon,parent,false))

    }


    override fun getItemCount(): Int = pokemon.size

    override fun onBindViewHolder(holder: PokeHolder, position: Int) {
        val item = pokemon[position]
        holder.render(item)
    }



    class PokeHolder(val view: View):RecyclerView.ViewHolder(view){
        val pokemonName = view.findViewById<TextView>(R.id.namePokemon)
        val pokemonImage = view.findViewById<ImageView>(R.id.imagePokemon)
        fun render(pokemonModel: Pokemon){
            pokemonName.text = pokemonModel.namePokemon
            pokemonImage




        }

    }


}
