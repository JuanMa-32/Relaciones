/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Entidades.Alumno;
import Entidades.Voto;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author NALDO
 */
public class Simulador {
    
    
    //metood para generar nombre y apellidos
    public ArrayList<String> generarNombres(int n){
        
        ArrayList<String> nombres = new ArrayList();
        
        String N[] = {"JUAN","AGUSTINA","AGUSTIN","SOFIA","MARTINA","FRANCO","MARTIN","LEANDRO","PABLO","JULIETA","MAXIMILIANO","CAMILA","ROMINA","MARCOS","WALTER","DARIO"};
        String[] A = {"MARTINEZ","ROMERO","FERNANDEZ","AGUERO","LOPEZ","RODRIGUEZ","PEREZ","MARADONA","LOMBARDO","MESSI","NEYMAR"};
        
        
        for (int i = 0; i < n; i++) {
            int nomb = (int) (Math.random()*16);
            int apell = (int) (Math.random()*11);
            
            String NombreCompleto= N[nomb]+" "+A[apell];
            nombres.add(NombreCompleto);
        }
        
        
        return nombres;
    }
    
    public ArrayList<Integer> generarDnis(int n){
         ArrayList<Integer> dnis = new ArrayList();
        
         
        for (int i = 0; i < n; i++) {
            int nomb = (int) (Math.random() * (48000000 - 25000000) + 25000000);
            dnis.add(nomb);

        }
        
         return dnis;
    }
    
    public ArrayList<Alumno> salaZoom(int n,ArrayList<String> nombres,ArrayList <Integer>dnis){
          ArrayList<Alumno> alumnos = new ArrayList();
        
          for (int i = 0; i < n; i++) {
            Alumno alum = new Alumno();
            alum.setNombreCompleto(nombres.get(i));
            alum.setDni(dnis.get(i));
            alumnos.add(alum);
        }
          
          
          return alumnos;
    }
    
    public void mostrarListado(ArrayList<Alumno> listAlumnos){
        
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<SALA 33>>>>>>>>>>>>>>>>>>>>>>>>\n");
        for (Alumno listAlumno : listAlumnos) {
            System.out.println(listAlumno);
        }
        
    }
    
    /*
    Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
    */
   ArrayList<Voto> claseVoto = new ArrayList();//arrayList para guardar al votante con sus 3 vtoos
    public void votacion(ArrayList<Alumno> listAlumnos){
        
      
        for (int i = 0; i < listAlumnos.size(); i++) {
            Voto v1 = new Voto();//creo una clase voto
            v1.setAlumno(listAlumnos.get(i));//seteo el alumno que va a votar
            int vUno = (int) (Math.random() * listAlumnos.size());//geenro 3 votos de forma aleatoria
            int vDos = (int) (Math.random() * listAlumnos.size());
            int vTres = (int) (Math.random() * listAlumnos.size());
            HashSet<Alumno> votados = new HashSet();//creo un hashset donde guardar la lista de alumnos que recibieron un voto
            if (vUno == i) {
            } else {
                votados.add(listAlumnos.get(vUno));
                listAlumnos.get(vUno).setCantVotos(listAlumnos.get(vUno).getCantVotos() + 1);//le agrego 1 voto al alumno que fue votado
            }
            if (vDos == i) {
            } else {
                votados.add(listAlumnos.get(vDos));
                listAlumnos.get(vDos).setCantVotos(listAlumnos.get(vDos).getCantVotos() + 1);
            }
            if (vTres == i) {
            } else {
                votados.add(listAlumnos.get(vTres));
                listAlumnos.get(vTres).setCantVotos(listAlumnos.get(vTres).getCantVotos() + 1);
            }

            v1.setListVotos(votados);//seteo la lista de los votados por el alumno i
            claseVoto.add(v1);//guardo el alumno y sus 3 votos para luego mostrarlo en otro metodo
        }

    }
    
    public void mostrarVotos(){
        
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<VOTOS>>>>>>><>>>>>>>>>>>>>>>>>><\n");
        for (Voto voto : claseVoto) {
            System.out.println(voto);
        }
    }
    
    
    
    
    public void recuentoVotos(ArrayList<Alumno> listAlumnos){
        
        ArrayList<Alumno> copiaAlumnos = new ArrayList(listAlumnos);//array donde elimino los que ya fueron asignados facilitadores
        ArrayList<Alumno> facilitadores = new ArrayList();//array donde voy a guardar los 5 facilitadores 
        ArrayList<Alumno> facilitadoreSuplentes = new ArrayList();//array donde voy a guardar los 5 facilitadores suplentes
    
        int buscarMayor = 0;
        int E = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < copiaAlumnos.size(); j++) {
                if (copiaAlumnos.get(j).getCantVotos() >= buscarMayor) {
                    buscarMayor = copiaAlumnos.get(j).getCantVotos();
                    E = j;//guardo la posicion del que mas votos tuvo
                }
            }
            facilitadores.add(copiaAlumnos.get(E));//guardo el alumno con mas votos
            copiaAlumnos.remove(E);//lo remuevo de la lista para que no vuelva a ser elejido

            buscarMayor = 0;
            E = 0;

        }

        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<FACILITADORES>>>>>>>>><>>>>>>>>>>>>>>>>>\n");

        for (Alumno aux : facilitadores) {
            System.out.println(aux);
        }
        
           for (int i = 0; i < 5; i++) {
            for (int j = 0; j < copiaAlumnos.size(); j++) {
                if (copiaAlumnos.get(j).getCantVotos() >= buscarMayor) {
                    buscarMayor = copiaAlumnos.get(j).getCantVotos();
                    E = j;//guardo la posicion del que mas votos tuvo
                }
            }
            facilitadoreSuplentes.add(copiaAlumnos.get(E));//guardo el alumno con mas votos
            copiaAlumnos.remove(E);//lo remuevo de la lista para que no vuelva a ser elejido

            buscarMayor = 0;
            E = 0;

        }
           System.out.println("\n<<<<<<<<<<<<<<<<<<<<<FACILITADORES SUPLENTES>>>>>><>>>>>>>>>>>>>>>\n");
            for (Alumno aux : facilitadoreSuplentes) {
            System.out.println(aux);
        }
    }
    
}
