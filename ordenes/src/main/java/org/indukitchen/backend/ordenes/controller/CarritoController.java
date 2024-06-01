package org.indukitchen.backend.ordenes.controller;

import org.indukitchen.backend.ordenes.service.ProductoServicio;
import org.indukitchen.backend.model.Producto;
import org.indukitchen.backend.ordenes.model.Carrito;
import org.indukitchen.backend.ordenes.model.Detalle;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarritoController {

    private final ProductoServicio productoServicio;
    private final Carrito carrito;

    public CarritoController(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
        this.carrito = new Carrito(UUID.randomUUID(), 0, 0, new ArrayList<>());
    }

    public void agregarProductoAlCarrito(UUID productoId, int cantidad) {
        Producto producto = productoServicio.consultarProductos().stream()
                .filter(p -> p.getID_producto().equals(productoId))
                .findFirst()
                .orElse(null);

        if (producto != null) {
            Detalle detalle = new Detalle(productoId, carrito.getID_carrito(), cantidad);
            carrito.getDetalles().add(detalle);
            carrito.setCantidad(carrito.getCantidad() + cantidad);
            carrito.setValor_total(carrito.getValor_total() + producto.getPrecio() * cantidad);
            System.out.println("Producto agregado al carrito: " + producto.getNombre());
        } else {
            System.out.println("Producto no encontrado: " + productoId);
        }
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public static void main(String[] args) {
        List<Producto> producto = new ArrayList<>();
        productos.add(new Producto("Producto 01", "electrónica", 299.99, "articulo", "Modelo X", "Descripción del Producto 01"));
        productos.add(new Producto("Producto 02", "electrodomésticos", 149.99, "articulo", "Modelo Y", "Descripción del Producto 02"));
        productos.add(new Producto("Producto 03", "servicio", 399.99, "servicio", "Modelo Z", "Descripción del Producto 03"));
        productos.add(new Producto("Producto 04", "Electrónica", 599.99, "articulo", "Modelo A", "Descripción del Producto 04"));
        productos.add(new Producto("Producto 05", "Electrodomésticos", 199.99, "articulo", "Modelo B", "Descripción del Producto 05"));
        productos.add(new Producto("Producto 06", "Muebles", 89.99, "articulo", "Modelo C", "Descripción del Producto 06"));

        }

}
