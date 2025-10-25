/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author gomez
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.05; // 5 por ciento
        return monto - descuento;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago con tarjeta " + numero + " por " + monto);
        return true;
    }
}

