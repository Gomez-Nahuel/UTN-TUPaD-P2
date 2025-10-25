/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8ecommerce;

import Excepciones.EdadInvalidaException;
import Interfaces.Cliente;
import Interfaces.EstadoPedido;
import Interfaces.Pedido;
import Interfaces.Producto;
import Interfaces.TarjetaCredito;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class TP8ecommerce {

    /**
     * @param args the command line arguments
     */
    
    // 2.1 division segura
    static void divisionSegura(Scanner sc) {
        System.out.print("Ingrese numerador: ");
        int a = sc.nextInt();
        System.out.print("Ingrese denominador: ");
        int b = sc.nextInt();
        try {
            int r = a / b;
            System.out.println("Resultado: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero");
        }
    }

    // 2.2 conversion de cadena a numero
    static void convertirEntero(Scanner sc) {
        System.out.print("Ingrese texto para convertir a int: ");
        String s = sc.next();
        try {
            int n = Integer.parseInt(s);
            System.out.println("Entero: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error: formato no valido");
        }
    }

    // 2.3 lectura de archivo
    static void leerArchivoSimple(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linea;
            while ((linea = br.readLine()) != null) System.out.println(linea);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de IO: " + e.getMessage());
        }
    }

    // 2.4 excepcion personalizada
    static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: " + edad);
        }
        System.out.println("Edad valida: " + edad);
    }

    // 2.5 try-with-resources
    static void leerArchivoConTryResources(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) System.out.println(linea);
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // DEMO parte 1
        Cliente cliente = new Cliente("Ana", "ana@mail.com");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 10.0));
        pedido.agregarProducto(new Producto("Teclado", 20.0));

        double total = pedido.calcularTotal();
        System.out.println("Total pedido: " + total);

        // Pagar con tarjeta con descuento
        TarjetaCredito tc = new TarjetaCredito("4111-xxxx");
        double totalConDesc = tc.aplicarDescuento(total);
        if (tc.procesarPago(totalConDesc)) {
            pedido.setEstado(EstadoPedido.PAGADO);
        }

        // Envio y entrega
        pedido.setEstado(EstadoPedido.ENVIADO);
        pedido.setEstado(EstadoPedido.ENTREGADO);

        // DEMO parte 2
        Scanner sc = new Scanner(System.in);
        try {
            divisionSegura(sc);
        } catch (InputMismatchException e) {
            System.out.println("Entrada no valida");
            sc.nextLine();
        }

        try {
            convertirEntero(sc);
        } catch (InputMismatchException e) {
            System.out.println("Entrada no valida");
            sc.nextLine();
        }

        // lectura de archivos
        leerArchivoSimple("archivo.txt");            // captura FileNotFoundException
        leerArchivoConTryResources("archivo.txt");   // try-with-resources

        // excepcion personalizada
        try {
            validarEdad(25);
            validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Capturada EdadInvalidaException: " + e.getMessage());
        }

        sc.close();
        System.out.println("Fin del TP 8");
    }
}
