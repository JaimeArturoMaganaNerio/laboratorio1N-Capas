package com.example.pokemonl1.PokemonRepository;


import com.example.pokemonl1.common.PokemonList;
import com.example.pokemonl1.domain.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {
    private final PokemonList pokemonList;

    public List<Pokemon> getPokemon(){

        return pokemonList.getPokemon();
    }
}
