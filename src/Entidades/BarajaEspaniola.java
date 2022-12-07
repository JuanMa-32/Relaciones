/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;


/**
 *
 * @author NALDO
 */
public class BarajaEspaniola {
    
    private ArrayList<Carta> baraja;

    public BarajaEspaniola() {
    }

    public BarajaEspaniola(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return   "\tBARAJA ESPAÑOLA COMPLETA Y ORDENADA\n"+ baraja+"";
    }

   
    
    
}
