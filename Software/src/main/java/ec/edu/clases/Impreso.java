/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.clases;

/**
 *
 * @author johan
 */
public class Impreso extends Libro {
     private double calcula;

    public Impreso(String titulo, String autor, String edicion) {
        super(titulo, autor, edicion);
    }

    @Override
    public double calcularBase(double precio) {
        calcula = (precio * 0.02) + 20;
        return calcula;
    }

    @Override
    public double calcularEnvio(double precio) {
    return 0;
    }

    
     
}
