/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.JuegoRuleta;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NALDO

 */
public class JuegoRuletaService {
    
    /* Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
     Revolver r1 = new Revolver();
     Scanner leer = new Scanner (System.in).useDelimiter("\n");
     ArrayList <Jugador> jugadores = new ArrayList();
     
         
     public void llenarRevolver(){
        
         Random aleatorio = new Random();
         
        r1.setPosicionActual(aleatorio.nextInt(7));
        r1.setPosicionAgua(aleatorio.nextInt(7));
     
    }
    
    public boolean mojar(){
        
        boolean mojado=false;
        
        if(r1.getPosicionActual()==r1.getPosicionAgua()){
            mojado=true;
        }
        
        return mojado;
    }
    
    
    public void siguienteChorro(){
         r1.setPosicionActual(r1.getPosicionActual()+1);
         
        if(r1.getPosicionActual()>6){
            r1.setPosicionActual(0);
        }
        
    }

    
   
    public String toString() {
        return  "Posicion Actual= " +r1.getPosicionActual()+ "\n Posicion Agua= " + r1.getPosicionAgua() ;
    }

    /*
    Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
*/
    
    public void crearPJ(){
        System.out.println("----CREAR PERSONAJE----\n"
                + "*Ingrese cuantas PJ creara");
        int n = leer.nextInt();
      
        if(n<1 || n>6){
            n=6;
        }
        
        for (int i = 1; i < n+1; i++) {
              Jugador player = new Jugador();
        
        System.out.println("Ingrese su nombre ");
        player.setName(leer.next());
        player.setId(i);
        player.setMojado(false);
        jugadores.add(player);
        }
        System.out.println("cantidad "+jugadores.size());
    }
    
    public void disparo(){
        
     
           int cont=0; 
   
        while (mojar() == false) {

            if (cont == jugadores.size()) {
                cont = 0;
                 siguienteChorro();
            }else{
                siguienteChorro();
            }
            cont++;
            
        }
       
       jugadores.get(cont).setMojado(true);//jugador mojado 
        System.out.println("EL JUGADOR QUE RECIBIO EL DISPARO FUE: "+jugadores.get(cont).getName());
     }
      
    

    /*
    Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    */
    
    public void llenarJuego(){
        
        JuegoRuleta JR = new JuegoRuleta(jugadores,r1);
        System.out.println(JR);
    }
    
    public void ronda(){
        llenarRevolver();
        System.out.println(toString());
        crearPJ();
        disparo();
        llenarJuego();
        
    }
}
