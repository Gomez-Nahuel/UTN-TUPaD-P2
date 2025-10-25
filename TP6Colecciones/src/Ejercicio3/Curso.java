/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author gomez
 */
public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    public void setProfesor(Profesor nuevoProfesor) {
        // Si ya tenía un profesor, quitarse de su lista
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignar el nuevo profesor
        this.profesor = nuevoProfesor;
        
        // Agregar este curso a la lista del nuevo profesor (si no es null)
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor asignado";
        System.out.println("Código: " + codigo + " | Curso: " + nombre + " | Profesor: " + nombreProfesor);
    }
    
    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
}
