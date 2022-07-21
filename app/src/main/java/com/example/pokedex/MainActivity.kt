package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()



            }
      private  fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemon)
        recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = PokeAdapter(PokemonProvider.pokemonlist)


        }


}




