package com.example.pokedex



import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.databinding.ItemPokemonBinding
import com.squareup.picasso.Picasso


class PokeAdapter(private val pokemonList:List<Pokemon>):RecyclerView.Adapter<PokeHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return PokeHolder(layoutInflater.inflate(R.layout.item_pokemon,parent,false))
    }


    override fun getItemCount(): Int = pokemonList.size

    override fun onBindViewHolder(holder: PokeHolder, position: Int) {
       val item = pokemonList[position]
        return holder.render(item)
    }

}


