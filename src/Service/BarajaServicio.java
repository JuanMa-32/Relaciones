/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.BarajaEspaniola;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class BarajaServicio {
    
     ArrayList <Carta> baraja = new ArrayList();
     Scanner leer = new Scanner (System.in);
   
    public void crearCartas(){
       
        for (int i = 1; i < 13; i++) {
            
           if(i==8 || i==9){
               
           }else{
                Carta cartas1 = new Carta(i, "espadas",false);
                Carta cartas2 = new Carta(i, "oro",false);
                Carta cartas3 = new Carta(i, "copa",false);
                Carta cartas4 = new Carta(i, "bastos",false);
                baraja.add(cartas1);
                baraja.add(cartas2);
                baraja.add(cartas3);
                baraja.add(cartas4);
           }
        }
   
      
    }
    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(){
        
     
        
        Collections.shuffle(baraja);
        System.out.println("----------------------------------------");
        for (Carta carta : baraja) {
            
           // System.out.println(carta);
        }
    }
    
   // • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    
    public void siguienteCarta(){
        
       boolean flag=false; 
        for (int i = 0; i < baraja.size(); i++) {
            if(baraja.get(i).isFueRepartida()==false ){
                System.out.println("Carta entregada:");
                System.out.println(baraja.get(i));
                baraja.get(i).setFueRepartida(true);
                
                break;
            }else{
                flag=true;
            }
            
        }
        if(flag){
            System.out.println("NO HAY MAS CARTAS PARA ENTREGAR");
        }
        
       
    }
    
    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
   
    public void cartasDisponibles(){
        
        int cont =0;
          for (int i = 0; i < baraja.size(); i++) {
            if(baraja.get(i).isFueRepartida()==false ){
                cont++;
            }
             
        }
          System.out.println(" QUEDAN "+cont+" CARTAS POR REPARTIR");
          
    }
    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    
    public void darCartas(){
        
        System.out.println("cuantas cartas quiere recibir");
        int cantCartas = leer.nextInt();
       
        int cont = 0;
        for (int i = 0; i < baraja.size(); i++) {
            if (baraja.get(i).isFueRepartida() == false) {
                cont++;
             
            }

        }
        boolean flag = true;
        
        for (int i = 0; i < cantCartas; i++) {
            if (cont >= cantCartas && baraja.get(i).isFueRepartida() == false) {
                System.out.println("Entregando carta "+(i+1));
                System.out.println(baraja.get(i));
                baraja.get(i).setFueRepartida(true);
                flag=false;
            }
        }
        if(flag){
            System.out.println("NO HAY ESA CANTIDAD DE CARTAS PARA REPARTIR");
        }
       
    }
    
    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    // indicárselo al usuario
    
    public void cartasMonton(){
        
        System.out.println("---CARTAS YA ENTREGADAS---");
        int cont =0;
          for (int i = 0; i < baraja.size(); i++) {
            if (baraja.get(i).isFueRepartida() == true) {
                System.out.println(baraja.get(i));
                cont++;
            }
        }
          
          if(cont==0){
              System.out.println("AUN NO HAN SALIDO CARTAS");
          }
          
    }
    
    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    //luego se llama al método, este no mostrara esa primera carta.
    
    public void mostrarBaraja(){
        
        for (int i = 0; i < baraja.size(); i++) {
               if (baraja.get(i).isFueRepartida() == false) {
                System.out.println(baraja.get(i));
                
            }
        }   
    }
    
    
    public void menu(){
         crearCartas();
        System.out.println("-----BARAJA ESPAÑOLA-----");
        boolean flag = true;
        
        do{
            System.out.println("opciones:\n"
                    + "1: Barajar\n"
                    + "2: Pedir una carta\n"
                    + "3: Cantidad de cartas disponibles\n"
                    + "4: Pedir cartas\n"
                    + "5: Mostrar cartas que ya salieron\n"
                    + "6: Mostrar cartas disponibles\n"
                    + "7: Salir de la partida");    
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    barajar();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBaraja();
                    break;
                case 7:
                    System.out.println("VOLVIENDO AL LOBBY...");
                    flag=false;
            }
            
        }while(flag);
       
        BarajaEspaniola barajaES = new BarajaEspaniola(baraja); 
        
         
        Collections.sort(baraja);
        System.out.println("\n");
        System.out.println(barajaES);
    }
    
}
