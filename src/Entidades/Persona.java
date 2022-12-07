/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author NALDO
  clase Persona con
atributos: nombre, apellido, edad, documento y Perro.

 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String DNI;
    private Perro perroAdoptar;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String DNI, Perro perroAdoptar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perroAdoptar = perroAdoptar;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Perro getPerroAdoptar() {
        return perroAdoptar;
    }

    public void setPerroAdoptar(Perro perroAdoptar) {
        this.perroAdoptar = perroAdoptar;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", perroAdoptar=" + perroAdoptar + '}';
    }
    
    

  
    
    
    
}
