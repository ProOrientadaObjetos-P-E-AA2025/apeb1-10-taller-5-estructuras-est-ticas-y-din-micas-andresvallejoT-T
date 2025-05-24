/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

/**
 *
 * @author Andrés
 */
import java.util.Scanner;

public class Problema_2_SistemaCalificacionesEjecutar {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Proble_2_Estudiante est = new Proble_2_Estudiante();
        Problema_2_Materia materia = new Problema_2_Materia();
        System.out.println("Igresar nombre del estudiante");
        est.setNombre(tcl.next());
        System.out.println("Igresar edad del estudiante");
        est.setEdad(tcl.nextInt());
        System.out.println("Ingresar nomrbe de la materia");
        materia.setMateria(tcl.next());
        System.out.println("Ingresar ADC, APE Y AA");
        materia.setAa(tcl.nextDouble());
        materia.setApe(tcl.nextDouble());
        materia.setAcd(tcl.nextDouble());
        System.out.println("El estudiante " + est.getNombre() + " con edad " + est.getEdad() + " en la materia " + materia.getMateria());
        materia.aprobacion();

    }
}
