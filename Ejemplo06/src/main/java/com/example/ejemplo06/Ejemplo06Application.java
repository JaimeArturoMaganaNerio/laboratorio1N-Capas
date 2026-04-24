package com.example.ejemplo06;

import com.example.ejemplo06.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejemplo06Application {

    public static void main(String[] args) {
        SpringApplication.run(Ejemplo06Application.class, args);
    }

    @Bean
    public CommandLineRunner run(ProductService productService) {

        return args -> {

            System.out.println("=== INICIANDO APP ===");
            productService.getAllProducts().forEach(p ->
                    System.out.println(p.getNombre() + " - $" + p.getPrecio())
            );
        };
    }


}
