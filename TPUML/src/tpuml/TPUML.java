/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpuml;

import java.time.LocalDate;

/**
 *
 * @author gomez
 */
public class TPUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// Ejercicio 1
        
Titular t = new Titular("Ana Perez", "12345678");
        Pasaporte p = new Pasaporte("AR7777", LocalDate.of(2024, 5, 20), "ana.png", "png");

        p.setTitular(t);

        System.out.println(p);
        System.out.println(t);
        System.out.println(p.getFoto());
    }
}

// Ejercicio 2


 

 
