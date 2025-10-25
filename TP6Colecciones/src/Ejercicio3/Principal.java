/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author gomez
 */
public class Principal {
    
public static void main(String[] args) {
       Universidad universidad = new Universidad("Universidad Tecnológica Nacional");
        
        // 1. Crear profesores y cursos
        System.out.println("=== CREANDO PROFESORES ===");
        Profesor prof1 = new Profesor("P001", "Dr. Juan Pérez", "Programación");
        Profesor prof2 = new Profesor("P002", "Dra. María López", "Bases de Datos");
        Profesor prof3 = new Profesor("P003", "Ing. Carlos Gómez", "Redes");
        
        System.out.println("\n=== CREANDO CURSOS ===");
        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Programación II");
        Curso curso3 = new Curso("C003", "Base de Datos I");
        Curso curso4 = new Curso("C004", "Redes de Computadoras");
        Curso curso5 = new Curso("C005", "Algoritmos");
        
        // 2. Agregar a la universidad
        System.out.println("\n=== AGREGANDO A LA UNIVERSIDAD ===");
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        // 3. Asignar profesores a cursos
        System.out.println("\n=== ASIGNANDO PROFESORES A CURSOS ===");
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P001");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P003");
        universidad.asignarProfesorACurso("C005", "P001");
        
        // 4. Listar cursos y profesores con sus relaciones
        universidad.listarCursos();
        System.out.println();
        prof1.listarCursos();
        System.out.println();
        prof2.listarCursos();
        System.out.println();
        prof3.listarCursos();
        
        // 5. Cambiar profesor de un curso
        System.out.println("\n=== CAMBIAR PROFESOR DEL CURSO ===");
        System.out.println("Cambiando profesor de Algoritmos...");
        universidad.asignarProfesorACurso("C005", "P002");
        
        System.out.println("\nVerificando sincronización:");
        prof1.listarCursos();
        System.out.println();
        prof2.listarCursos();
        
        // 6. Remover un curso
        System.out.println("\n=== ELIMINAR CURSO ===");
        universidad.eliminarCurso("C004");
        System.out.println("\nVerificando que ya no aparece en el profesor:");
        prof3.listarCursos();
        
        // 7. Remover un profesor
        System.out.println("\n=== ELIMINAR PROFESOR ===");
        universidad.eliminarProfesor("P002");
        System.out.println("\nCursos que quedaron sin profesor:");
        universidad.listarCursos();
        
        // 8. Reporte final
        universidad.mostrarReporteCursosPorProfesor();
    }
    
}
