/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Random;



/**
 *
 * @author NALDO
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 */
public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
           }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    
    public void llenarRevolver(){
         Random aleatorio = new Random();
        posicionActual = aleatorio.nextInt(6-1+1)+1;
        posicionAgua = aleatorio.nextInt(6-1+1)+1;
        
    }
    
    public boolean mojar(){
        
        boolean mojado=false;
        
        if(posicionActual==posicionAgua){
            mojado=true;
        }
        
        return mojado;
    }
    
    public void siguienteChorro(){
        
        posicionActual+=1;
    }

    
    @Override
    public String toString() {
        return  "Posicion Actual= " + posicionActual + "\n Posicion Agua= " + posicionAgua ;
    }

    
    
    
}
