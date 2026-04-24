package com.example.pokemonl1.serveces;

import com.example.pokemonl1.PokemonRepository.PokemonRepository;
import com.example.pokemonl1.domain.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.getPokemon();
    }

    public List<Pokemon> filterByTipo(String tipo) {
        return getAllPokemon().stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }


    public List<Pokemon> filterByZona(String zona) {
        return getAllPokemon().stream()
                .filter(p -> p.getZona().equalsIgnoreCase(zona))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filterByDebilidad(String debilidad) {
        return getAllPokemon().stream()
                .filter(p -> p.getDebilidades().stream()
                        .anyMatch(d -> d.equalsIgnoreCase(debilidad)))
                .collect(Collectors.toList());
    }
}