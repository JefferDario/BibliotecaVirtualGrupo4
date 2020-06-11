/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.clases;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author johan
 */
public class Principal {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        
        Libro l1 = new Impreso("La casa de los espiritus", "Isabel Allende", "Primera");
        double pl1 = l1.calcularCosto(17.50);
        

        Libro l2 = new Impreso("Cien años de soledad", "Gabriel Garcia Marques", "Segunda");
        double pl2 = l2.calcularCosto(20.00);

        Libro l3 = new Impreso("El diario de Ana Franck", "Ana Frank", "Tercera");
        double pl3 = l3.calcularCosto(18.50);
        
        Libro l4 = new Impreso("El senor de los anillos","J.R. TOLKIE","Primera");
        double pl4 = l4.calcularCosto(14.00);
        
        
        Libro d1 = new Digital("El alquimista", "Pablo Coullo", "Cuarta");
        double pd1 = d1.calcularCosto(30.00);

        Libro d2 = new Digital("El Quijote", "Miguel De Cervantes", "Quinta");
        double pd2 = d2.calcularCosto(19.99);

        Libro d3 = new Digital("Game of Thrones", "George R.R. Martin ", "Cuarta");
        double pd3 = d3.calcularCosto(27.50);
        
        Libro d4 = new Digital("Harry Potter", "J.K Rowling", "Segunda");
        double pd4 = d4.calcularCosto(30.00);
        
        System.out.println("\n VENTA DE LIBROS \n");
        
        Cliente cli = new Cliente("1753803962", "Johan", "Cordova", "Gonzales Suares", 50.00);
        
         System.out.println("Cedula: "+ cli.getCedula() +" Nombres: "+ cli.getNombre() + " " +cli.getApellido() + " Direccion: "+cli.getDireccion() + "\nCredito : " + cli.getCredito());
         
         
        System.out.println("1. Comprar Libros");
        System.out.println("2. Lista de mis Libros");
        System.out.println("3. Recargar Credito");
        System.out.println("4. Salir");
        
        int op;
        int opLi;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println(" Seleccione una opcion : ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    
                    System.out.println("libros disponibles.");
                    System.out.println("libros Impresos");
                    System.out.println("\t1. " + l1.getTitulo() + " $" + pl1);
                    System.out.println("\t2. " + l2.getTitulo() + " $" + pl2);
                    System.out.println("\t3. " + l3.getTitulo() + " $" + pl3);
                    System.out.println("\t4. " + l4.getTitulo() + " $" + pl4);
                    System.out.println("libros Digitaless");
                    System.out.println("\t5. " + d1.getTitulo() + " $" + pd1);
                    System.out.println("\t6. " + d2.getTitulo() + " $" + pd2);
                    System.out.println("\t7. " + d3.getTitulo() + " $" + pd3);
                    System.out.println("\t8. " + d4.getTitulo() + " $" + pd4);
                    System.out.println("\t9. Salir");
                                        
                    do {
                         System.out.print("Ingrese un numero: ");
                        opLi = s.nextInt();
                        switch (opLi) {
                            case 1:
                                if (cli.getCredito() > pl1) {
                                    cli.comparLibro(l1);
                                    cli.restarCredito(cli.getCredito() - pl1);
                                     System.out.println("Comprado Correctamente");
                                } else {
                                    System.out.println("Credito insuficiente, realizar una recarga");
                                }
                                break;
                            case 2:
                                if (cli.getCredito() > pl2) {
                                    cli.comparLibro(l2);
                                    cli.restarCredito(cli.getCredito() - pl2);
                                      System.out.println("Comprado Correctamente");
                                } else {
                                    System.out.println("Credito insuficiente, realizar una recarga");
                                }
                                break;
                            case 3:
                                if (cli.getCredito() > pl3) {
                                    cli.comparLibro(l3);
                                    cli.restarCredito(cli.getCredito() - pl3);
                                      System.out.println("Comprado Correctamente");
                                } else {
                                    System.out.println("Credito insuficiente, realizar una recarga");
                                }

                                break;
                            case 4:
                                if (cli.getCredito() > pd1) {
                                    cli.comparLibro(l1);
                                    cli.restarCredito(cli.getCredito() - pd1);
                                      System.out.println("Comprado Correctamente");
                                } else {
                                    System.out.println("Credito insuficiente, realizar una recarga");
                                }
                                break;
                            case 5:
                                if (cli.getCredito() > pd2) {
                                    cli.comparLibro(d2);
                                    cli.restarCredito(cli.getCredito() - pd2);
                                      System.out.println("Comprado Correctamente");
                                } else {
                                    System.out.println("Credito insuficiente, realizar una recarga");
                                }
                                break;
                            case 6:
                                if (cli.getCredito() > pd3) {
                                    cli.comparLibro(d3);
                                    cli.restarCredito(cli.getCredito() - pd3);
                                      System.out.println("Comprado Correctamente");
                                } else {
                                    System.out.println("Credito insuficiente, realizar una recarga");
                                }
                                break;
                        }
                        
                    } while (opLi != 9);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("\n" + cli.getNombre() + " Libros Comprados\n");
                    ArrayList<Libro> libros = cli.listarCompras();
                    for (Libro libro : libros) {
                        System.out.println("===========================");
                        System.out.println("Titulo: " + libro.getTitulo());
                        System.out.println("Autor: " + libro.getAutor());
                        System.out.println("Edicion: " + libro.getEdicion());
                        System.out.println("===========================");
                    }
                    break;
                case 3:
                    System.out.println("\n Credito actual: " + cli.getCredito());
                    System.out.print("Ingrese valor de recarga : ");
                    double recarga = s.nextDouble();
                    cli.recargarCredito(recarga);
                    System.out.println("CREDITO DESPUES DE RECARGA : " + cli.getCredito());
                    System.out.println("");
                    System.out.println("-----------------------------");
                    break;
            }
 System.out.println(" Venta Libros ");
       
            System.out.println("cedula: "+ cli.getCedula() +" Nombre: "+ cli.getNombre() + " " + cli.getApellido() + " Direccion: "+cli.getDireccion() + "\nCredito : " + cli.getCredito());
     
            System.out.println("1. Comprar Libro");
            System.out.println("2. Lista de mis Libros");
            System.out.println("3. Recargar Credito");
            System.out.println("4. Salir");
        } while (op != 4);
    }
    
}
