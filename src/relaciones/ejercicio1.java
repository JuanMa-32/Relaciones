/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import Entidades.Perro;
import Entidades.Persona;
import Enum.RazaPerro;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;



/**
 *
 * @author NALDO
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in).useDelimiter("\n");
      
     
        
        Perro p1 = new Perro("india", RazaPerro.boxer, 5, "mediano",false);
        Perro p2 = new Perro("bruno", RazaPerro.callejero,6 , "chico",false);
        Perro p3 = new Perro("rocco", RazaPerro.caniche, 2, "grande",false);
        Perro p4 = new Perro("mancha",RazaPerro.pitbull , 13, "chico",false);
        Perro p5 = new Perro("negro", RazaPerro.boxer, 7, "grande",false);
        Perro p6 = new Perro("lali", RazaPerro.callejero, 1, "chico",false);
        Perro p7 = new Perro("morena", RazaPerro.caniche, 2, "grande",false);
        Perro p8 = new Perro("blanquita", RazaPerro.pitbull, 4, "mediano",false);
        Perro p9 = new Perro("nina", RazaPerro.caniche, 5, "microToy",false);
        Perro p10 = new Perro("aston", RazaPerro.caniche, 6, "grande",false);
        
      List <Perro> listPerros = new ArrayList<>();
              listPerros.add(p1);
              listPerros.add(p2);
              listPerros.add(p3);
              listPerros.add(p4);
              listPerros.add(p5);
              listPerros.add(p6);
              listPerros.add(p7);
              listPerros.add(p8);
              listPerros.add(p9);
              listPerros.add(p10);
      
              
       
        int cont=0;
       /*
        
        int compatibilidadPerro1=0;
        int compatibilidadPerro2=0;
         int disponible=0;
        */
        List <Persona> listAdopcion = new ArrayList<>();
        do{
            
               System.out.println("\n----BIENVENIDO AL PROGRAMA DE ADOPCION----");
             Persona pers = new Persona();
             System.out.println("Ingrese su nombre");
             pers.setNombre(leer.next());
             System.out.println("Ingrese apellido");
             pers.setApellido(leer.next());
             System.out.println("Ingrese su edad");
             pers.setEdad(leer.nextInt());
             System.out.println("Ingrese su DNI");
             pers.setDNI(leer.next());
             
             
             System.out.println("ESTOS SON LOS PERROS QUE TENEMOS EN ADOPCION");
             for (Perro aux : listPerros) {
                 System.out.println(aux);
            }
             System.out.println("\nLe interesa adoptar? SI/NO");
             String adoptara = leer.next();
           
             if(adoptara.equalsIgnoreCase("si")){
                   System.out.println("Ingrese el nombre del perro que adoptara");
             String opcion = leer.next();
                 for (Perro aux : listPerros) {
                     if(aux.getNombre().equals(opcion) && aux.isAdoptado()==false ){
                        
                         pers.setPerroAdoptar(aux);
                         aux.setAdoptado(true);
                         System.out.println("FELICITACIONES "+aux.getNombre()+" ES SU NUEVO COMPAÑERO");
                     }else if(aux.getNombre().equals(opcion) && aux.isAdoptado()==true){
                         System.out.println("LO SENTIMOS, YA FUE ADOPTADO");
                        
                     }
                     
                 }
               
             }else{
                 System.out.println("HASTA LA PROXIMA");
             }
             
             
            
             
             
             
            /*
             System.out.println("¿Que raza le gustaria adoptar?");
             String raza = leer.next();
             
             System.out.println("Ingrese la edad promedio que le gustaria");
             int edad = leer.nextInt();
             
            
             
             String anios;
             if(edad<2){
                 anios = "cachorro";
                 
             }else{
                 anios = "adulto";
             }
             */
             /**
             if(perro1.getRaza().equalsIgnoreCase(raza)){
                 compatibilidadPerro1++;
             }else if(perro2.getRaza().equalsIgnoreCase(raza)){
                 compatibilidadPerro2++;
             }
             
             if (anios.equals("cachorro")) {
                compatibilidadPerro2++;
            } else  {
                compatibilidadPerro1++;
            }
            */
             /**
             if(((compatibilidadPerro1>compatibilidadPerro2) || (compatibilidadPerro1==compatibilidadPerro2 && perro1.getRaza().equalsIgnoreCase(raza)))  &&   disponible==0){
            p1.setPerroAdoptar(perro1);
            disponible++;
        }else{
                   p1.setPerroAdoptar(perro2);
             }
             */

             listAdopcion.add(pers);
             
            cont++;
        }while(cont!=4);
        
     
        //for para mostrar las personas con el perro que adoptaron 
        for (Persona aux : listAdopcion) {
            System.out.println(aux);
        }
      
        
    }
    
}
