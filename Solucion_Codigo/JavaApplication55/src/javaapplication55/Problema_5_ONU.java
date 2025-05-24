/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55;

/**
 *
 * @author Andrés
 */
public class Problema_5_ONU {
    public static void main(String[] args) {
        ConflictoInternacional conflicto = new ConflictoInternacional("Conflicto Mundial", "2025-25-12");

        conflicto.agregarPais("Pais A");
        conflicto.agregarPais("Pais B");
        conflicto.agregarPais("Pais C");

        EventoConflicto evento1 = new EventoConflicto("Batalla Frontal", "2025-02-04", "Zona b", "batalla", "Batalla importante", 60);
        EventoConflicto evento2 = new EventoConflicto("Cese al fuego", "2025-07-10", "Capital A", "tratado", "Tratado firmado", 0);

        conflicto.agregarEvento(evento1);
        conflicto.agregarEvento(evento2);

        conflicto.evaluarConflicto();
        conflicto.mostrarResumen();
    }
}