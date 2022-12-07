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
 * De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
public class Cine {
    
    private ArrayList<Espectador> viwer;
    private Pelicula pelicula;
    private int precio;
    private String [][] butacas;
  

    public Cine() {
        viwer = new ArrayList();
        butacas = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                butacas[i][j]=" ";
            }
        }
      
        
    }

    public Cine(ArrayList<Espectador> viwer, Pelicula pelicula, int precio, String[][] butacas) {
        this.viwer = viwer;
        this.pelicula = pelicula;
        this.precio = precio;
        this.butacas = butacas;
    }

    public ArrayList<Espectador> getViwer() {
        return viwer;
    }

    public void setViwer(ArrayList<Espectador> viwer) {
        this.viwer = viwer;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String[][] getButacas() {
        return butacas;
    }

    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }

    
    public boolean buscarLugar(){
        
        boolean disponible = false;
        int cont =0;
        
        /*
        creo un bucle para verificar que almenos haya un lugar disponible
        */
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if(butacas[i][j].equals(" ")){
                    cont++;
                }
            }
        }
        
        /*
        creo un while para asignarle una butaca aleatoria
        */
        while (cont > 0 && disponible == false) {
            
            int num = (int) (Math.random() * 8);//fila aleatoria
            int num2 = (int) (Math.random() * 6);//columna aleatoria
            
            if (butacas[num][num2].equals(" ")) {

                butacas[num][num2] = "x";
                disponible = true;
                
            }
        }
       
        return disponible;
    }
    
    @Override
    public String toString() {
        return "------------CINE JAVA------------- \n" + "<<<<<<<Clientes>>>>>>\n" + viwer + "\n -------pelicula------- \n" + pelicula + "\n Precio:\t" + precio;
    }

   

   
  
    
}
