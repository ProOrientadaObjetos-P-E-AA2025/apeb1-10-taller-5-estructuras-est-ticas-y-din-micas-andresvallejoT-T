/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

import java.util.Scanner;

/**
 *
 * @author Andrés
 */
public class Problema_3_DepartamentosDeUnaEmpeza {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingresar el nombre de la empreza, su ruc y su direccion");
        Empreza em = new Empreza(tcl.next(), tcl.nextInt(), tcl.next());
        System.out.println("Ingresar la cantiad de departamentos");
        int cant = tcl.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresar el nombre del departamento, la cantidad de empleados y la ganancia anual");
            var pe = new Departamento(tcl.next(), tcl.nextInt(), tcl.nextDouble());
            System.out.println(pe);
        }

    }
}
