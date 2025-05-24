/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

/**
 *
 * @author Andrés
 */
public class Departamento {

    private String nombre;
    private int nEmple;
    private double producAnual;
    private char categoria;

    public Departamento(String nombre, int nEmple, double producAnual) {
        this.nombre = nombre;
        this.nEmple = nEmple;
        this.producAnual = producAnual;
        cate();
    }

    public void cate() {
        if (this.nEmple > 20 && this.producAnual > 1000000) {
            this.categoria = 'A';
        } else if (this.nEmple > 10 && this.producAnual > 500000) {
            this.categoria = 'B';
        } else if (this.nEmple <= 10 && this.producAnual <= 500000) {
            this.categoria = 'C';
        } else {
            this.categoria = 'D';
        }

    }

    public String toString() {
        return "Departamento " + nombre + "\nEmpleados " + nEmple + "\nProduccion Anual: " + producAnual + "\nCategoria " + categoria;

    }
}
