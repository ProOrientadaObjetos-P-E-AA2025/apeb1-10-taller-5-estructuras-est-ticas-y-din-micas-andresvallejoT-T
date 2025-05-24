/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

/**
 *
 * @author Andrés
 */
public class Caso {

    String nombre;
    private int dias;
    String estado;
    private Persona[] personas;
    private int cantPersonas;

    public Caso(String nombre, int dias) {
        this.nombre = nombre;
        this.dias = dias;
        this.estado = "Iniciado";
        this.personas = new Persona[10];
        this.cantPersonas = 0;
    }

    public void agregarPersona(Persona p) {
        if (cantPersonas < 10) {
            personas[cantPersonas] = p;
            cantPersonas++;
        }
    }

    public void actualizarEstado() {
        if (dias > 14) {
            estado = "Urgente";
        } else if (dias > 7) {
            estado = "Alerta";
        }
    }

    public void mostrarPersonas() {
        for (int i = 0; i < cantPersonas; i++) {
            System.out.println("- " + personas[i].nombre + " (" + personas[i].rol + ")");
        }
    }
}
