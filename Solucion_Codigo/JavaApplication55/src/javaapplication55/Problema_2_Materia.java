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
public class Problema_2_Materia {

    Scanner tcl = new Scanner(System.in);
    private String materia;
    private double acd;
    private double ape;
    private double aa;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getAcd() {
        return acd;
    }

    public void setAcd(double acd) {
        this.acd = acd;
    }

    public double getApe() {
        return ape;
    }

    public void setApe(double ape) {
        this.ape = ape;
    }

    public double getAa() {
        return aa;
    }

    public void setAa(double aa) {
        this.aa = aa;
    }

    public void aprobacion() {
        double total = aa + ape + acd;

        if (total < 7) {
            System.out.println("Debe rendir un examen de recuperacion de 3.5/10 pts.");
            recuperacion();

        } else {
            System.out.println("Estudiante Aprobado");
        }

    }

    public Problema_2_Materia() {
    }

    public void recuperacion() {
        double total = aa + ape + acd;

        System.out.println("Ingresar la nota del examen de recuperacion:");
        double rec = tcl.nextDouble();
        if ((rec + (total * 0.6)) < 7) {
            System.out.println("Estudiante reprobado");
        } else {
            System.out.println("Estudiante Aprobado");
        }
    }
}
