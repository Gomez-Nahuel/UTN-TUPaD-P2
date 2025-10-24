/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3poo;

/**
 *
 * @author gomez
 */
public class TP3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // === EJERCICIO 1
        Estudiante e1 = new Estudiante();

        e1.nombre = "Nahuel";
        e1.apellido = "Gomez";
        e1.curso = "Programacion 2";
        e1.calificacion = 7.5;

        e1.mostrarInfo();

        e1.subirCalificacion(1.0);

        e1.bajarCalificacion(0.5);

        e1.mostrarInfo();
        
     // === EJERCICIO 2
         
        Mascota m1 = new Mascota();

        m1.nombre = "Nery";
        m1.especie = "Perro";
        m1.edad = 3;

        m1.mostrarInfo();

        m1.cumplirAnios();

        m1.mostrarInfo();
        
     // === EJERCICIO 3
     
        Libro libro1 = new Libro();

        libro1.setTitulo("El Principito");
        libro1.setAutor("Antoine de Saint-Exupery");

        libro1.setAnioPublicacion(-1943);

        libro1.setAnioPublicacion(1943);

        libro1.mostrarInfo();
     
     // === EJERCICIO 4
     
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 5;

        g2.idGallina = 2;
        g2.edad = 1;
        g2.huevosPuestos = 3;

        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();

        System.out.println("Estado final de las gallinas");
        System.out.println("-------------------------");
        g1.mostrarEstado();
        g2.mostrarEstado();
     
     // === EJERCICIO 4
     
        NaveEspacial nave = new NaveEspacial("Nismo", 50);

        nave.despegar();                
        nave.avanzar(30);               
        nave.recargarCombustible(40);  
        nave.avanzar(20);               
        nave.mostrarEstado();           
    }
}
    
