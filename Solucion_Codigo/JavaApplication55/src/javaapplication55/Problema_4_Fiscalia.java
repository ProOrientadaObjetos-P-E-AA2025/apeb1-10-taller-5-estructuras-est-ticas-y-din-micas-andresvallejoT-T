/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

/**
 *
 * @author Andrés
 */
public class Problema_4_Fiscalia {
      public static void main(String[] args) {
        Caso casp = new Caso("Caso Soborno", 10);

        Persona p1 = new Persona("Pedro", 530, "Presidente", "acusado", true);
        Persona p2 = new Persona("Lucho", 345, "ExPresidente", "testigo", false);

        casp.agregarPersona(p1);
        casp.agregarPersona(p2);

        casp.actualizarEstado();

        System.out.println("Nombre del caso: " + casp.nombre);
        System.out.println("Estado del caso: " + casp.estado);
        System.out.println("Personas involucradas:");
        casp.mostrarPersonas();
    }
}