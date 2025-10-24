/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3poo;

/**
 *
 * @author gomez
 */
public class Mascota {
    
    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {
        System.out.println("=== Datos de la Mascota ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("---------------------------");
    }

    public void cumplirAnios() {
        edad = edad + 1;
        System.out.println(nombre + " cumplio un anio Nueva edad: " + edad);
    }
}
