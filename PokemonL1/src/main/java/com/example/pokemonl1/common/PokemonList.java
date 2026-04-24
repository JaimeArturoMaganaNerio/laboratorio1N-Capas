package com.example.pokemonl1.common;

import com.example.pokemonl1.domain.entities.Pokemon;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonList {

    private final List<Pokemon> pokemon;

    public PokemonList() {
        this.pokemon = new ArrayList<>();

        this.pokemon.add(Pokemon.builder()
                .nombre("Fuecoco")
                .tipo("Fuego")
                .debilidades(List.of("Agua", "Roca", "Tierra"))
                .zona("playa")
                .region("Paldea")
                .build());

        this.pokemon.add(Pokemon.builder()
                .nombre("Sprigatito")
                .tipo("Planta")
                .debilidades(List.of("Fuego", "Volador", "Bicho"))
                .zona("praderas")
                .region("Paldea")
                .build());

        this.pokemon.add(Pokemon.builder()
                .nombre("Quaxly")
                .tipo("Agua")
                .debilidades(List.of("Planta", "Eléctrico"))
                .zona("playa")
                .region("Paldea")
                .build());

        this.pokemon.add(Pokemon.builder()
                .nombre("Ceruledge")
                .tipo("Fuego y fantasma")
                .debilidades(List.of("Agua", "Tierra", "Roca", "Fantasma", "Siniestro"))
                .zona("Zona sur de paldea")
                .region("Paldea")
                .build());
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }
}