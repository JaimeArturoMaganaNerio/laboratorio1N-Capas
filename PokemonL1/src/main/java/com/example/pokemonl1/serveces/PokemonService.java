package com.example.pokemonl1.serveces;


import com.example.pokemonl1.PokemonRepository.PokemonRepository;
import com.example.pokemonl1.domain.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private  final PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemon(){
        return pokemonRepository.getPokemon();
    }


}
