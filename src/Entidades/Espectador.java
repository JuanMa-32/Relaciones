/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;



/**
 *
 * @author NALDO
 * del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
public class Espectador {
    
    private String nombre;
    private int edad;
    private int dinero;
    private Scanner leer;

    public Espectador() {
        leer= new Scanner(System.in).useDelimiter("\n");
    }

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    

    
     public void ingresarEspec(){
        
            
        System.out.println("--------------BIENVENIDO A CINES JAVA------------------\n"
                + "ingrese sus datos...\n");
        
            
        
            System.out.println("Ingresar su nombre");
            nombre = leer.next();
            
            System.out.println("Ingrese su edad");
            edad= leer.nextInt();
            
            System.out.println("Ingrese su saldo en la tarjeta");
            dinero = leer.nextInt();
            
      
 
        
       
    }

    @Override
    public String toString() {
        return   "\nNombre: \t" + nombre + "\n Edad: \t" + edad + "\n Dinero:\t" + dinero ;
    }
    
    
    
}
