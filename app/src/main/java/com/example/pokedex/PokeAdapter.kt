package com.example.pokedex



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.databinding.ItemPokemonBinding
import com.squareup.picasso.Picasso


class PokeAdapter(val pokemon:List<Pokemon>):RecyclerView.Adapter<PokeAdapter.PokeHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeAdapter.PokeHolder {
       val binding = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PokeHolder(binding)

    }


    override fun getItemCount(): Int = pokemon.size

    override fun onBindViewHolder(holder: PokeHolder, position: Int) {
        val item = pokemon[position]
       // holder.render(item)
    }



    class PokeHolder(val binding: ItemPokemonBinding):RecyclerView.ViewHolder(binding.root) {
        fun render(pokeModel: Pokemon) {
            binding.namePokemon.text = pokeModel.namePokemon
            Picasso.get().load(pokeModel.imagePokemon).into(binding.imagePokemon)

        }

    }
}
