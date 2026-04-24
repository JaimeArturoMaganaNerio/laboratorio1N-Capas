package com.example.pokemonl1.PokemonRunner;

import com.example.pokemonl1.domain.entities.Pokemon;
import com.example.pokemonl1.serveces.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@RequiredArgsConstructor
public class RunnerPokemon implements CommandLineRunner {

    private final PokemonService pokemonService;

    @Override
    public void run(String... args) {
        System.out.println("\n=== INICIANDO REGISTRO POKÉDEX (PROFESOR OAK) ===\n");


        System.out.println(">>> Filtrando por Tipo: Fuego");
        imprimirResultados(pokemonService.filterByTipo("Fuego"));


        System.out.println("\n>>> Filtrando por Zona: playa");
        imprimirResultados(pokemonService.filterByZona("playa"));

        System.out.println("\n>>> Filtrando por Debilidad: Planta");
        imprimirResultados(pokemonService.filterByDebilidad("Planta"));
    }

    private void imprimirResultados(List<Pokemon> lista) {
        lista.forEach(p -> {
            String debilidades = String.join(", ", p.getDebilidades());
            System.out.printf("[PKMN] Nombre: %s | Tipo: %s | Debilidades: %s%n",
                    p.getNombre(), p.getTipo(), debilidades);
        });
    }
}