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
public class Digital extends Libro{
    

    private double calcula;
    

    public Digital(String titulo, String autor, String edicion) {
        super(titulo, autor, edicion);
    }

    @Override
    public double calcularBase(double precio) {
        calcula = (precio * 0.12);
        return calcula;
    }
    //digital no tiene valor de envio
 @Override
    public double calcularEnvio(double precio) {
        return 0;
    }

   

  
   

  

    
   

   
    
    
}
