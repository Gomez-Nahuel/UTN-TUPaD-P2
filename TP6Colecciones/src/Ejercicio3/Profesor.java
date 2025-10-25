/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author gomez
 */
public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            cursos.remove(curso);
            // Si el curso todavía apunta a este profesor, dejarlo en null
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }
    
    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  - No dicta cursos actualmente");
        } else {
            for (Curso curso : cursos) {
                System.out.println("  - " + curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Profesor: " + nombre + 
                         " | Especialidad: " + especialidad + 
                         " | Cantidad de cursos: " + cursos.size());
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public ArrayList<Curso> getCursos() { return cursos; }
}
