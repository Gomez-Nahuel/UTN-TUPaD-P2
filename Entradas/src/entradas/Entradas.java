/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Entradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad (int): ");
        int edad = sc.nextInt();        // si luego leyeras otra línea, usa sc.nextLine() para limpiar

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
    
}