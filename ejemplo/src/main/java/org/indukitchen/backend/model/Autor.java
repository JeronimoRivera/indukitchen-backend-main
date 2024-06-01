package org.indukitchen.backend.model;

import java.util.UUID;

public class Producto {
    private UUID ID_producto;
    private String nombre;
    private String categoría;
    private float precio;
    private String tipo_producto;
    private String modelo;
    private String descripción;

    // Getters y setters
}

public class Articulo extends Producto {

}

public class Detalle {
    private UUID ID_producto;
    private UUID ID_carrito;
    private int cantidad;


}

public class Carrito {
    private UUID ID_producto;
    private float valor_total;
    private int cantidad;

}

}
