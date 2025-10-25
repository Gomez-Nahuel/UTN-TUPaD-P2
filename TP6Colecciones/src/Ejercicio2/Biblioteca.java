/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author gomez
 */
public class Biblioteca {
    
    private String nombre;
    private ArrayList<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("✓ Libro agregado: " + titulo);
    }
    
    public void listarLibros() {
        System.out.println("\n=== LIBROS DE LA BIBLIOTECA: " + nombre + " ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
    Libro libro = null;
    int i = 0;
    while (i < libros.size() && !libros.get(i).getIsbn().equals(isbn)) {
        i++;
    }
    if (i < libros.size()) {
        libro = libros.get(i);
    }
    return libro;
}
    
    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("✓ Libro eliminado: " + libro.getTitulo());
        } else {
            System.out.println("✗ Libro no encontrado con ISBN: " + isbn);
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en ese año.");
        }
    }
    
    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== AUTORES DISPONIBLES EN LA BIBLIOTECA ===");
        ArrayList<String> autoresMostrados = new ArrayList<>();
        
        for (Libro libro : libros) {
            String autorId = libro.getAutor().getId();
            if (!autoresMostrados.contains(autorId)) {
                libro.getAutor().mostrarInfo();
                autoresMostrados.add(autorId);
            }
        }
    }
    
    public String getNombre() { return nombre; }
}
