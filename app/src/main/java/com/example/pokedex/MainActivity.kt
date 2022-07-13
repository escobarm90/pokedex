package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PokeAdapter(PokemonProvider.pokemons)
    }


}