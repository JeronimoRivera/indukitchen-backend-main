package org.indukitchen.backend.service;

import org.indukitchen.backend.model.Producto;
import org.indukitchen.backend.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {
    private final ProductoRepository productoRepository;

    public ProductoServicio(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> consultarProductos(){
        return productoRepository.findAll();
    }
}

