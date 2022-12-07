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
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
public class JuegoRuleta {
    
    
    private ArrayList<Jugador> listJugadores;
    private Revolver revolver;

    public JuegoRuleta() {
    }
    
    

    public JuegoRuleta(ArrayList<Jugador> listJugadores, Revolver revolver) {
        this.listJugadores = listJugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getListJugadores() {
        return listJugadores;
    }

    public void setListJugadores(ArrayList<Jugador> listJugadores) {
        this.listJugadores = listJugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return  "listJugadores=" + listJugadores + "\n revolver=" + revolver ;
    }
    
    
    
    
}
