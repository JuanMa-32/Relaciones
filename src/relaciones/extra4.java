/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import Entidades.Alumno;
import Service.Simulador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Simulador simu = new Simulador();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("INGRESE CUANTOS ALUMNOS CREARA EN LAS SALAS DE ZOOM");
        int cantAlum = leer.nextInt();
        
        ArrayList<Integer> dnis = simu.generarDnis(cantAlum);//recibo la lista con dnis
      
        ArrayList<String> nombres = simu.generarNombres(cantAlum);//recibo la lista con nombres completos
        
        ArrayList<Alumno> listAlumnos= simu.salaZoom(cantAlum, nombres, dnis); //recibo la lista de alumnos con valores setiados
        
        simu.mostrarListado(listAlumnos);//muestro la lista
        
        simu.votacion(listAlumnos);//metodo donde creo votos 
        
        simu.mostrarVotos();//metodo donde muestro alumno y sus 3 votos
        
        simu.recuentoVotos(listAlumnos);//metodo donde cuento los votos;
        
        
    }

}
