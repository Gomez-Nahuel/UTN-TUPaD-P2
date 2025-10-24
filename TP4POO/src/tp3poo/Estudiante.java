/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3poo;

/**
 *
 * @author gomez
 */
public class Estudiante {
    
    String nombre;
    String apellido;
    String curso;
    double calificacion;
   
    public void mostrarInfo() {
        System.out.println("=== Datos del Estudiante ===");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("------------------------------");
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La calificacion subio en " + puntos + " puntos. Nueva calificacion: " + calificacion);
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("La calificacion bajo en " + puntos + " puntos. Nueva calificacion: " + calificacion);
    }
}
