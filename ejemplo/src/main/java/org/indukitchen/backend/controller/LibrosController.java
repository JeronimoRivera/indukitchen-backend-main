package org.indukitchen.backend.controller;

import org.indukitchen.backend.service.ProductoServicio;

import java.util.UUID;

package org.indukitchen.backend.model;

public class Producto {
    private UUID ID_producto;
    private String nombre;
    private String categoría;
    private float precio;
    private String tipo_producto;
    private String modelo;
    private String descripción;


    public UUID getID_producto() {
        return ID_producto;
    }

    public void ID_producto(UUID ID_producto) {
        this.ID_producto = ID_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
}

