/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class Problema_1_SistemaDeVentasCarritoDeCompras {

    ArrayList<Problema_1_SistemaDeVentasProducto> carrito = new ArrayList<>();
    ArrayList<Problema_1_SistemaDeVentasProducto> tienda = new ArrayList<>();

    public Problema_1_SistemaDeVentasCarritoDeCompras(ArrayList<Problema_1_SistemaDeVentasProducto> tienda) {
        this.tienda = tienda;
    }

    public void agregarProducto(String nombre, int cantidad) {
        for (Problema_1_SistemaDeVentasProducto producto : tienda) {
            if (producto.nombre.equalsIgnoreCase(nombre)) {
                if (producto.cantidad >= cantidad) {
                    carrito.add(new Problema_1_SistemaDeVentasProducto(producto.nombre, producto.precio, cantidad));
                    System.out.println("Producto agregado al carrito.");
                } else {
                    System.out.println("No hay suficiente cantidad disponible.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado en la tienda.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Problema_1_SistemaDeVentasProducto p : carrito) {
            total += p.precio * p.cantidad;
        }
        return total;
    }

    public void realizarPago(double monto, double descuentoDado) {
        double total = calcularTotal();
        if (monto > 1000) {
            double descuento = total * (descuentoDado / 100);
            total -= descuento;
            System.out.println("Descuento aplicado! Nuevo total: $" + total);
        }

        if (monto >= total) {
            System.out.println("Pago realizado con exito. Gracias por su compra!");
            actualizarInventario();
        } else {
            System.out.println("Fondos insuficientes. Faltan: $" + (total - monto));
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("--- Detalle de la compra ---");
        for (Problema_1_SistemaDeVentasProducto p : carrito) {
            System.out.println(p.nombre + " x " + p.cantidad + " = $" + (p.precio * p.cantidad));
        }
        System.out.println("Total: $" + calcularTotal());
    }

    private void actualizarInventario() {
        for (Problema_1_SistemaDeVentasProducto comprado : carrito) {
            for (Problema_1_SistemaDeVentasProducto producto : tienda) {
                if (producto.nombre.equalsIgnoreCase(comprado.nombre)) {
                    producto.cantidad -= comprado.cantidad;
                }
            }
        }
    }
}
