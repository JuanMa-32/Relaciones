/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class CineService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
      Cine cine = new Cine();
    public void crearCine(){
        
         
        
       
        Pelicula rocky = new Pelicula();//Creo la pelicula que se vera en el cine
        rocky.film();
        

        ArrayList<Espectador> listClientes = new ArrayList();//CREO UNA LISTA PARA AGREGAR LOS QUE VERAN LA PELICULA

        cine.setPelicula(rocky);//SETEO LA PELICULA A MI SALA DE CINE
        cine.setPrecio(800);//SETEO EL VALOR DE LA PELICULA

        String opc = "SI";

        while (opc.equalsIgnoreCase("si")) {
            
           Espectador espec = new Espectador();//CREO UN ESPECTADOR
           espec.ingresarEspec();//LLAMO AL METODO DONDE SETEO SUS VALORES
            System.out.println("HOLA " + espec.getNombre());
            if (espec.getDinero() > cine.getPrecio() && espec.getEdad() >= rocky.getEdadMin() && cine.buscarLugar() == true) {
                System.out.println("\noperacion realizada, disfrute la pelicula");
                listClientes.add(espec);
            } else {
                System.out.println("\nHubo un error en la compra de su ticket");

            }
            System.out.println("\n¿Hay mas clientes en la fila? SI/NO");
            opc = leer.next();
        }

        cine.setViwer(listClientes);//SETEO LOS QUE CUMPLIERON LAS CONDIICONES Y LOS AGREGO A LA LISTA DE CLIENTES
        
    }
    
    
    
    public void mostrarSala(){
        //MUESTRO LOS CLIENTES,PELICULA Y REPRESENTACION GRAFICA DE LOS ASIENTOS
          System.out.println(cine+" \n"
                  + "---------SALA----------");
          
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getButacas()[i][j]+"|");
            }
            System.out.println("");
        }
        
       
    }
    
    
 
}
