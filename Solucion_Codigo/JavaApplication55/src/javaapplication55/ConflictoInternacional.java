/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

/**
 *
 * @author Andrés
 */
public class ConflictoInternacional {
    String nombre;
    String fecha;
    String estado;
    String[] paises;
    EventoConflicto[] eventos; 
    int cantPaises;
    int cantEventos;

    public ConflictoInternacional(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = "Activo";
        this.paises = new String[10];
        this.eventos = new EventoConflicto[10];
        this.cantPaises = 0;
        this.cantEventos = 0;
    }

    public void agregarPais(String pais) {
        if (cantPaises < 10) {
            paises[cantPaises++] = pais;
        }
    }

    public void agregarEvento(EventoConflicto evento) {
        if (cantEventos < 10) {
            eventos[cantEventos++] = evento;
        }
    }

    public void evaluarConflicto() {
        int batallas = 0;
        int bajasAltas = 0;
        for (int i = 0; i < cantEventos; i++) {
            EventoConflicto e = eventos[i];
            if (e.tipo.equals("batalla")) {
                batallas++;
            }
            if (e.bajas >= 50) {
                bajasAltas++;
            }
        }

        if (batallas > (cantPaises / 2)) {
            estado = "Guerra Mundial";
        } else if (bajasAltas > 0) {
            estado = "Urgente";
        }
    }

    public void mostrarResumen() {
        System.out.println("Conflicto: " + nombre);
        System.out.println("Estado: " + estado);
        System.out.println("Paises involucrados:");
        for (int i = 0; i < cantPaises; i++) {
            System.out.println("- " + paises[i]);
        }

        System.out.println("Eventos:");
        for (int i = 0; i < cantEventos; i++) {
            System.out.println("- " + eventos[i].nombre + " (" + eventos[i].tipo + ")");
        }
    }
}
