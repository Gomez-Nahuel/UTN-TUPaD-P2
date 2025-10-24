/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpuml;

import java.time.LocalDate;

/**
 *
 * @author gomez
 */
public class Pasaporte {
    
private String numero;
    private LocalDate fechaEmision;
    private Foto foto;         
    private Titular titular;   

    // constructor basico, crea la Foto como parte del Pasaporte
    public Pasaporte(String numero, LocalDate fechaEmision, String img, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(img, formato); 
    }

    // sobrecarga: permite pasar una instancia Foto ya armada
    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto != null ? foto : new Foto();
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporteInterno(this);
        }
    }

    @Override
    public String toString() {
        String nom = titular != null ? titular.getNombre() : "sin_titular";
        return "Pasaporte{numero='" + numero + "', fechaEmision=" + fechaEmision
                + ", foto=" + foto + ", titular=" + nom + "}";
    }
}
