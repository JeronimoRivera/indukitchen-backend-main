package org.indukitchen.backend.ordenes.listarproducto;

import org.indukitchen.backend.ordenes.service.ProductoServicio;
import org.indukitchen.backend.model.Producto;

import java.util.List;
import java.util.UUID;

public class ListarProductosController {

    private final ProductoServicio productoServicio;

    public ListarProductosController(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    public void listarProductos() {
        List<Producto> productos = productoServicio.consultarProductos();

        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getID_producto());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Categoría: " + producto.getCategoría());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Tipo de Producto: " + producto.getTipo_producto());
            System.out.println("Modelo: " + producto.getModelo());
            System.out.println("Descripción: " + producto.getDescripción());
            System.out.println("-------------");
        }
    }

    public static void main(String[] args) {

        List<Producto> productos = List(
                new Producto("Producto 01", "electrónica", 299.99f, "articulo", "Modelo X", "Descripción del Producto 01"),
                new Producto("Producto 02", "electrodomésticos", 149.99f, "articulo", "Modelo Y", "Descripción del Producto 02"),
                new Producto("Producto 03", "servicio", 399.99f, "servicio", "Modelo Z", "Descripción del Producto 03"),
                new Producto("Producto 04", "Electrónica", 599.99f, "articulo", "Modelo A", "Descripción del Producto 04"),
                new Producto("Producto 05", "Electrodomésticos", 199.99f, "articulo", "Modelo B", "Descripción del Producto 05"),
                new Producto("Producto 06", "Muebles", 89.99f, "articulo", "Modelo C", "Descripción del Producto 06")
        );

        listarProductosController.listarProductos();
    }
}

