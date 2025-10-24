/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpuml;

/**
 *
 * @author gomez
 */
public class Titular {
    
private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociacion bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    // se usa para mantener la relacion bidireccional sin bucles
    void setPasaporteInterno(Pasaporte p) {
        this.pasaporte = p;
    }

    public void vincularPasaporte(Pasaporte p) {
        this.pasaporte = p;
        if (p != null && p.getTitular() != this) {
            p.setTitular(this);
        }
    }

    @Override
    public String toString() {
        String nro = pasaporte != null ? pasaporte.getNumero() : "sin_pasaporte";
        return "Titular{nombre='" + nombre + "', dni='" + dni + "', pasaporte=" + nro + "}";
    }
}
    
    

