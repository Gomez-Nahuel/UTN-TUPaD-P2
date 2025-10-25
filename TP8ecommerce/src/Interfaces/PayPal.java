/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author gomez
 */
public class PayPal implements Pago {
    private String cuenta;

    public PayPal(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago con PayPal " + cuenta + " por " + monto);
        return true;
    }
}
