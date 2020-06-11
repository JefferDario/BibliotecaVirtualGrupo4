/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.clases;

import java.util.ArrayList;

/**
 *
 * @author johan
 */
public class Cliente {
     private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private double credito;
    private final ArrayList<Libro> libros;

    public Cliente(String cedula, String nombre, String apellido, String direccion, double credito) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.credito = credito;
         this.libros = new ArrayList<>();
    }
    
    public void recargarCredito(double credito) {
        this.credito = this.credito + credito;
    }

    public void restarCredito(double credito) {
        this.credito = credito;
    }
    public void comparLibro(Libro libro) {
        libros.add(libro);
    }
    public ArrayList listarCompras() {
        return libros;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

  

    
    
    
}
