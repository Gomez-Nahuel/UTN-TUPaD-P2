/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author gomez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        
        // 1. Crear y agregar productos
        System.out.println("=== CREANDO PRODUCTOS ===");
        inventario.agregarProducto(new Producto("P001", "Arroz", 1500, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Laptop", 5000, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Camisa", 2500, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Lámpara", 1800, 30, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Mouse", 800, 80, CategoriaProducto.ELECTRONICA));
        
        // 2. Listar todos los productos
        inventario.listarProductos();
        
        // 3. Buscar producto por ID
        System.out.println("\n=== BUSCAR PRODUCTO POR ID ===");
        Producto encontrado = inventario.buscarProductoPorId("P002");
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            encontrado.mostrarInfo();
        }
        
        // 4. Filtrar por categoría
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
        // 5. Eliminar producto
        System.out.println("\n=== ELIMINAR PRODUCTO ===");
        inventario.eliminarProducto("P005");
        inventario.listarProductos();
        
        // 6. Actualizar stock
        System.out.println("\n=== ACTUALIZAR STOCK ===");
        inventario.actualizarStock("P001", 150);
        
        // 7. Total de stock
        System.out.println("\n=== TOTAL DE STOCK ===");
        System.out.println("Stock total: " + inventario.obtenerTotalStock() + " unidades");
        
        // 8. Producto con mayor stock
        System.out.println("\n=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }
        
        // 9. Filtrar por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        // 10. Mostrar categorías
        inventario.mostrarCategoriasDisponibles();
    }
    
}
    

