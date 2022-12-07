/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import Service.CineService;

/**
 *
 * @author NALDO
 */
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      CineService cine = new CineService();
        
      cine.crearCine();
      cine.mostrarSala();
      
        
    }
    
}
