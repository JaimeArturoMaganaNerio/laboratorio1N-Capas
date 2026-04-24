package com.example.pokemonl1.common;

import com.example.pokemonl1.domain.entities.Pokemon;
import org.springframework.stereotype.Component;

import  java.util.ArrayList;
import java.util.List;

@Component
public class PokemonList {
    private final List<Pokemon> pokemon;
}
