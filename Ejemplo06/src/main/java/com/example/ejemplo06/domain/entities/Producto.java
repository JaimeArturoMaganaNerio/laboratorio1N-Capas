package com.example.ejemplo06.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //genera getter y setters
@Builder// facilitar la construccion del objeto
@AllArgsConstructor //hace un constructor con todos los parametros
@NoArgsConstructor //hace un comnstructor vacio
public class Producto {

    private Long id;
    private String nombre;
    private Double precio;
}
