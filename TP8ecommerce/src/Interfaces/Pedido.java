/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author gomez
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private EstadoPedido estado = EstadoPedido.CREADO;
    private Notificable receptorNotificacion;

    public Pedido(Notificable receptorNotificacion) {
        this.receptorNotificacion = receptorNotificacion;
    }

    public void agregarProducto(Producto p) {
        if (p != null) productos.add(p);
    }

    public List<Producto> getProductos() { return productos; }

    public EstadoPedido getEstado() { return estado; }

    public void setEstado(EstadoPedido nuevo) {
        EstadoPedido anterior = this.estado;
        this.estado = nuevo;
        if (receptorNotificacion != null) {
            receptorNotificacion.notificarCambio(
                "Pedido paso de " + anterior + " a " + nuevo
            );
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.calcularTotal();
        return total;
    }
}
