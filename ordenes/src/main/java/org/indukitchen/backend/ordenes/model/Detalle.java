package org.indukitchen.backend.ordenes.model;

import java.util.UUID;

public class Detalle {
    private UUID ID_producto;
    private UUID ID_carrito;
    private int cantidad;

    public Detalle(UUID ID_producto, UUID ID_carrito, int cantidad) {
        this.ID_producto = ID_producto;
        this.ID_carrito = ID_carrito;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public UUID getID_producto() {
        return ID_producto;
    }

    public void setID_producto(UUID ID_producto) {
        this.ID_producto = ID_producto;
    }

    public UUID getID_carrito() {
        return ID_carrito;
    }

    public void setID_carrito(UUID ID_carrito) {
        this.ID_carrito = ID_carrito;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

