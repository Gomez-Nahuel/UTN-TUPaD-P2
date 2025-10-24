/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4pruebaempleado;

/**
 *
 * @author gomez
 */
public class TP4PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Empleado emp1 = new Empleado(1, "Juan Perez", "Desarrollador", 2000.0);
        Empleado emp2 = new Empleado("Maria Lopez", "Diseñadora");

        emp1.actualizarSalario(10);   
        emp2.actualizarSalario(500);  
      
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}