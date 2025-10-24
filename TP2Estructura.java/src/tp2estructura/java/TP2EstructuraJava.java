/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2estructura.java;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class TP2EstructuraJava {
    
     // ====== Utiles generales ======
    static final Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    static final DecimalFormat df = new DecimalFormat("#.##");
    
     // ======  variable "global" para descuento especial ======
    static double DESCUENTO_ESPECIAL = 0.10; // 10%

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         while (true) {
            System.out.println("\n=== TP2 - Programación Estructurada ===");
            System.out.println("1) Año bisiesto");
            System.out.println("2) Mayor de tres números");
            System.out.println("3) Clasificación de edad");
            System.out.println("4) Descuento por categoría (A/B/C)");
            System.out.println("5) Suma de pares (while, hasta 0)");
            System.out.println("6) Contador Pos/Neg/Ceros (for x10)");
            System.out.println("7) Validación de nota 0..10 (do-while)");
            System.out.println("8) Precio final (impuesto y descuento)");
            System.out.println("9) Costo envío + Total compra");
            System.out.println("10) Actualizar stock");
            System.out.println("11) Descuento especial (variable global)");
            System.out.println("12) Array precios: modificar y mostrar");
            System.out.println("13) Array precios: imprimir recursivo antes/después");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");

            int op = leerEnteroSeguro();
            switch (op) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 0 -> { System.out.println("¡Listo!"); return; }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    // ====== Lecturas seguras ======
    static int leerEnteroSeguro() {
        while (!scan.hasNextInt()) {
            System.out.print("Ingrese entero válido: ");
            scan.next();
        }
        return scan.nextInt();
    }

    static double leerDoubleSeguro() {
        while (!scan.hasNextDouble()) {
            System.out.print("Ingrese número válido: ");
            scan.next();
        }
        return scan.nextDouble();
    }

    // ====== 1. Año bisiesto ======
    static void ejercicio1() {
        System.out.print("Ingrese un año: ");
        int y = leerEnteroSeguro();
        boolean bisiesto = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        System.out.println("El año " + y + (bisiesto ? " es" : " no es") + " bisiesto.");
    }

    // ====== 2. Mayor de 3 números ======
    static void ejercicio2() {
        System.out.print("Ingrese el primer número: ");
        int a = leerEnteroSeguro();
        System.out.print("Ingrese el segundo número: ");
        int b = leerEnteroSeguro();
        System.out.print("Ingrese el tercer número: ");
        int c = leerEnteroSeguro();
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);
    }

    // ====== 3. Clasificación de edad ======
    static void ejercicio3() {
        System.out.print("Ingrese su edad: ");
        int edad = leerEnteroSeguro();
        String etapa = (edad < 12) ? "Niño"
                : (edad <= 17) ? "Adolescente"
                : (edad <= 59) ? "Adulto"
                : "Adulto mayor";
        System.out.println("Eres un " + etapa + ".");
    }

    // ====== 4. Descuento por categoría A/B/C ======
    static void ejercicio4() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDoubleSeguro();
        System.out.print("Ingrese la categoría (A/B/C): ");
        String cat = scan.next().trim().toUpperCase();

        double porcentaje = switch (cat) {
            case "A" -> 10;
            case "B" -> 15;
            case "C" -> 20;
            default -> { System.out.println("Categoría inválida."); yield 0; }
        };

        double descuento = precio * (porcentaje / 100.0);
        double finalP = precio - descuento;
        System.out.println("Descuento aplicado: " + df.format(porcentaje) + "%");
        System.out.println("Precio final: " + df.format(finalP));
    }

    // ====== 5. Suma pares (while) hasta 0 ======
    static void ejercicio5() {
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int n = leerEnteroSeguro();
            if (n == 0) break;
            if (n % 2 == 0) suma += n;
        }
        System.out.println("La suma de los números pares es: " + suma);
    }

    // ====== 6. Contador Pos/Neg/Ceros (for) ======
    static void ejercicio6() {
        int pos = 0, neg = 0, cer = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = leerEnteroSeguro();
            if (n > 0) pos++;
            else if (n < 0) neg++;
            else cer++;
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cer);
    }

    // ====== 7. Nota 0..10 (do-while) ======
    static void ejercicio7() {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = leerEnteroSeguro();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente: " + nota);
    }

    // ====== 8. Precio final con impuesto y descuento ======
    static void ejercicio8() {
        System.out.print("Ingrese el precio base del producto: ");
        double base = leerDoubleSeguro();
        System.out.print("Ingrese el impuesto % (ej: 10): ");
        double imp = leerDoubleSeguro();
        System.out.print("Ingrese el descuento % (ej: 5): ");
        double desc = leerDoubleSeguro();
        double precioFinal = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + df.format(precioFinal));
    }

    static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        double imp = precioBase * (impuestoPct / 100.0);
        double desc = precioBase * (descuentoPct / 100.0);
        return precioBase + imp - desc;
    }

    // ====== 9. Costo envío + total compra ======
    static void ejercicio9() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDoubleSeguro();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = leerDoubleSeguro();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scan.next().trim();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);

        System.out.println("El costo de envío es: " + df.format(costoEnvio));
        System.out.println("El total a pagar es: " + df.format(total));
    }

    static double calcularCostoEnvio(double peso, String zona) {
        boolean nacional = zona.equalsIgnoreCase("Nacional");
        boolean internacional = zona.equalsIgnoreCase("Internacional");
        if (!nacional && !internacional) {
            System.out.println("Zona inválida. Se toma Nacional por defecto.");
            nacional = true;
        }
        double tarifa = nacional ? 5 : 10;
        return tarifa * peso;
    }

    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // ====== 10. Actualizar stock ======
    static void ejercicio10() {
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = leerEnteroSeguro();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = leerEnteroSeguro();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = leerEnteroSeguro();
        int nuevo = actualizarStock(stockActual, cantVendida, cantRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevo);
    }

    static int actualizarStock(int stockActual, int vendida, int recibida) {
        return stockActual - vendida + recibida;
    }

    // ====== 11. Descuento especial (variable global) ======
    static void ejercicio11() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDoubleSeguro();
        double precioFinal = calcularDescuentoEspecial(precio);
        System.out.println("El precio final con descuento es: " + df.format(precioFinal));
    }

    static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;  // local
        System.out.println("El descuento especial aplicado es: " + df.format(descuentoAplicado));
        return precio - descuentoAplicado;
    }

    // ====== 12. Arrays: modificar y mostrar ======
    static void ejercicio12() {
        double[] precios = {199.99, 299.50, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + df.format(p));

        // “Modificar el precio de un producto específico”: por ejemplo el índice 2
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        for (double p : precios) System.out.println("Precio: $" + df.format(p));
    }

    // ====== 13. Arrays + recursividad ======
    static void ejercicio13() {
        double[] precios = {199.99, 299.50, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }

    static void imprimirArrayRecursivo(double[] arr, int i) {
        if (i >= arr.length) return;
        System.out.println("Precio: $" + df.format(arr[i]));
        imprimirArrayRecursivo(arr, i + 1);
    }
}
    
    

