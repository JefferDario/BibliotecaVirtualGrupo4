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
public abstract class Libro {
      private String titulo;
    private String autor;
    private String edicion;
    private double result;

    public Libro(String titulo, String autor, String edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
    }


    public abstract double calcularBase (double precio);
    public abstract double calcularEnvio(double precio);
    
    public double calcularCosto(double precio){
    return precio + calcularBase(precio);
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    
}
