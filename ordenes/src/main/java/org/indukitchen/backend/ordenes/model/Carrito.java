package org.indukitchen.backend.ordenes.model;

import java.util.List;
import java.util.UUID;

public class Carrito {
    private UUID ID_carrito;
    private float valor_total;
    private int cantidad;
    private List<Detalle> detalles;

    public Carrito(UUID ID_carrito, float valor_total, int cantidad, List<Detalle> detalles) {
        this.ID_carrito = ID_carrito;
        this.valor_total = valor_total;
        this.cantidad = cantidad;
        this.detalles = detalles;
    }

    // Getters y setters
    public UUID getID_carrito() {
        return ID_carrito;
    }

    public void setID_carrito(UUID ID_carrito) {
        this.ID_carrito = ID_carrito;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }
}