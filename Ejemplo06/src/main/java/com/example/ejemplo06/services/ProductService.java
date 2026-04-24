package com.example.ejemplo06.services;

import com.example.ejemplo06.domain.entities.Producto;
import com.example.ejemplo06.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Producto> getAllProducts() {
        return productRepository.getProducts();
    }
}
