/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kata3;

/**
 *
 * @author gomez
 */
public class EmpleadoTemporal extends Empleado {
    private int horas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, int horas, double valorHora) {
        super(nombre);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horas * valorHora;
    }
}

