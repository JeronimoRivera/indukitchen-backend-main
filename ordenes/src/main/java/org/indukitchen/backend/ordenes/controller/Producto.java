package org.indukitchen.backend.ordenes.controller;

import java.util.UUID;

public class Producto {
    private UUID ID_producto;
    private String nombre;
    private String categoria;
    private float precio;
    private String tipo_producto;
    private String modelo;
    private String descripcion;

    public Producto(UUID ID_producto, String nombre, String categoria, float precio, String tipo_producto, String modelo, String descripcion) {
        this.ID_producto = ID_producto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.tipo_producto = tipo_producto;
        this.modelo = modelo;
        this.descripcion = descripcion;
    }

    public Producto(String s, String muebles, double v, String articulo, String modeloC, String modelo) {
    }

    // Getters y setters
    public UUID getID_producto() {
        return ID_producto;
    }

    public void setID_producto(UUID ID_producto) {
        this.ID_producto = ID_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

