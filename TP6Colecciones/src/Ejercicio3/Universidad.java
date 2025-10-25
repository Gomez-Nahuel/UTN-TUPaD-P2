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
public class Universidad {
    
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
        System.out.println("✓ Profesor agregado: " + profesor.getNombre());
    }
    
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("✓ Curso agregado: " + curso.getNombre());
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("✓ Profesor " + profesor.getNombre() + 
                             " asignado al curso " + curso.getNombre());
        } else {
            System.out.println("✗ No se pudo realizar la asignación");
        }
    }
    
    public void listarProfesores() {
        System.out.println("\n=== PROFESORES DE " + nombre + " ===");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        System.out.println("\n=== CURSOS DE " + nombre + " ===");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        Profesor p = null;
        int i = 0;
        while (i < profesores.size() && !profesores.get(i).getId().equals(id)) {
            i++;
        }
        if (i < profesores.size()) {
            p = profesores.get(i);
        }
        return p;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper la relación con su profesor
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("✓ Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("✗ Curso no encontrado");
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar en null todos los cursos que dictaba
            ArrayList<Curso> cursosProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosProfesor) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("✓ Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("✗ Profesor no encontrado");
        }
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + ": " + profesor.getCursos().size() + " cursos");
        }
    }
    
    public String getNombre() { return nombre; }
}
