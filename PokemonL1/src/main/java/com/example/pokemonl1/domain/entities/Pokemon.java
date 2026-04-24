package com.example.pokemonl1.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    private String nombre;
    private String tipo;
    private String zona;
    private String region;



}
