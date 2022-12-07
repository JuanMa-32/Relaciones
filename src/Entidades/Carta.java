/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



/**
 *
 * @author NALDO
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La
 */
public class Carta implements Comparable<Carta> {
    
   private Integer carta;
   private String palo;
   private boolean fueRepartida;

    public Carta() {
    }

    public Carta(Integer carta, String palo, boolean fueRepartida) {
        this.carta = carta;
        this.palo = palo;
        this.fueRepartida = fueRepartida;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(Integer carta) {
        this.carta = carta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public boolean isFueRepartida() {
        return fueRepartida;
    }

    public void setFueRepartida(boolean fueRepartida) {
        this.fueRepartida = fueRepartida;
    }

    
    
    @Override
    public String toString() {
        return "carta=\t" + carta + " \t" + palo + "\n";
    }

    @Override
    public int compareTo(Carta t) {
       return this.carta.compareTo(t.carta);
    }

  

   
   
    
}
