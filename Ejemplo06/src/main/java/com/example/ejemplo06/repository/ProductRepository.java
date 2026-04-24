package com.example.ejemplo06.repository;


import com.example.ejemplo06.common.ProductList;
import com.example.ejemplo06.domain.entities.Producto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    //si no coloco final se le coloca arriba @Autowired
    private final ProductList productList;

   public List<Producto> getProducts(){

       return productList.getProducts();
    }
}
