/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

import java.util.Scanner;
import java.util.ArrayList;

public class Problema_1_SistemaDeVentasEjecutor {

    public static void main(String[] args) {
        ArrayList<Problema_1_SistemaDeVentasProducto> tienda = new ArrayList<>();
        tienda.add(new Problema_1_SistemaDeVentasProducto("laptop", 800, 10));
        tienda.add(new Problema_1_SistemaDeVentasProducto("tablet", 300, 5));
        tienda.add(new Problema_1_SistemaDeVentasProducto("smartphone", 500, 8));

        Problema_1_SistemaDeVentasCarritoDeCompras carrito = new Problema_1_SistemaDeVentasCarritoDeCompras(tienda);
        Scanner tcl = new Scanner(System.in);
        int opcion;
        boolean pe = true;
        while (pe) {
            System.out.println("\n1. Agregar producto al carrito");
            System.out.println("2. Mostrar detalle de compra");
            System.out.println("3. Realizar pago");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = tcl.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del producto: ");
                    String nombre = tcl.next();
                    System.out.print("Cantidad: ");
                    int cantidad = tcl.nextInt();
                    carrito.agregarProducto(nombre, cantidad);
                }
                case 2 -> carrito.mostrarDetalleCompra();
                case 3 -> {
                    System.out.print("Monto a pagar: ");
                    double monto = tcl.nextDouble();
                    System.out.print("Descuento promocional (%): ");
                    double descuento = tcl.nextDouble();
                    carrito.realizarPago(monto, descuento);
                }
                case 4 -> {
                    System.out.println("Gracias por usar el sistema de ventas.");
                    pe = false;
                }
                default -> System.out.println("Opción invlida.");
            }
        }
    }
}
