/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7herencia;

import Kata1.Auto;
import Kata2.Circulo;
import Kata2.Figura;
import Kata2.Rectangulo;
import Kata3.Empleado;
import Kata3.EmpleadoPlanta;
import Kata3.EmpleadoTemporal;
import Kata4.Animal;
import Kata4.Gato;
import Kata4.Perro;
import Kata4.Vaca;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class TP7Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== TRABAJO PRACTICO 7 - HERENCIA Y POLIMORFISMO =====");
            System.out.println("1. Vehiculos");
            System.out.println("2. Figuras Geometricas");
            System.out.println("3. Empleados");
            System.out.println("4. Animales");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    ejecutarVehiculos();
                    break;
                case 2:
                    ejecutarFiguras();
                    break;
                case 3:
                    ejecutarEmpleados();
                    break;
                case 4:
                    ejecutarAnimales();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }

            System.out.println();

        } while (opcion != 0);

        sc.close();
    }

    // ===== KATA 1 =====
    private static void ejecutarVehiculos() {
        System.out.println("--- KATA 1: Vehiculos ---");
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();
    }

    // ===== KATA 2 =====
    private static void ejecutarFiguras() {
        System.out.println("--- KATA 2: Figuras Geometricas ---");
        Figura[] figuras = {
            new Circulo("Circulo", 3),
            new Rectangulo("Rectangulo", 4, 5)
        };

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - Area: " + f.calcularArea());
        }
    }

    // ===== KATA 3 =====
    private static void ejecutarEmpleados() {
        System.out.println("--- KATA 3: Empleados ---");
        Empleado[] empleados = {
            new EmpleadoPlanta("Ana", 250000),
            new EmpleadoTemporal("Luis", 120, 2000)
        };

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Sueldo: " + e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else {
                System.out.println("Tipo: Temporal");
            }
            System.out.println("--------------------");
        }
    }

    // ===== KATA 4 =====
    private static void ejecutarAnimales() {
        System.out.println("--- KATA 4: Animales ---");
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca()
        };

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("--------------------");
        }
    }
}

