/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package errorejemplo;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class ErrorEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // CORRECCIÓN: usar nextLine() para texto
        System.out.println("Hola, " + nombre);
    }
    
}
