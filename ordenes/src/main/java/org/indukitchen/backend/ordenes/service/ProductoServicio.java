package org.indukitchen.backend.ordenes.service;

import org.indukitchen.backend.model.Producto;
import org.indukitchen.backend.ordenes.controller.Producto;

import java.util.List;

public class ProductoServicio {
    private final List<Producto> productoRepository;

    public ProductoServicio(List<Producto> productoRepository) {
        this.productoRepository = productoRepository;
    }

    public ProductoServicio(List<Producto> productos) {
    }

    public List<Producto> consultarProductos() {
        return productoRepository;
    }
}
