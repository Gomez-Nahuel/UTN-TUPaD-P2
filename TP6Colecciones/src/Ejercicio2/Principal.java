/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author gomez
 */
public class Principal {
    
public static void main(String[] args) {
        // 1. Crear biblioteca
        System.out.println("=== CREANDO BIBLIOTECA ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("✓ Biblioteca creada: " + biblioteca.getNombre());
        
        // 2. Crear autores
        System.out.println("\n=== CREANDO AUTORES ===");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        System.out.println("✓ 3 autores creados");
        
        // 3. Agregar libros
        System.out.println("\n=== AGREGANDO LIBROS ===");
        biblioteca.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El Amor en los Tiempos del Cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("ISBN004", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("ISBN005", "La Casa de los Espíritus", 1982, autor3);
        
        // 4. Listar todos los libros
        biblioteca.listarLibros();
        
        // 5. Buscar libro por ISBN
        System.out.println("\n=== BUSCAR LIBRO POR ISBN ===");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            System.out.println("Libro encontrado:");
            encontrado.mostrarInfo();
        }
        
        // 6. Filtrar por año
        biblioteca.filtrarLibrosPorAnio(1985);
        
        // 7. Eliminar libro
        System.out.println("\n=== ELIMINAR LIBRO ===");
        biblioteca.eliminarLibro("ISBN004");
        biblioteca.listarLibros();
        
        // 8. Mostrar cantidad total
        System.out.println("\n=== CANTIDAD TOTAL DE LIBROS ===");
        System.out.println("Total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());
        
        // 9. Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
    
}
