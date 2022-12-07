/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.util.HashSet;

/**
 *
 * @author NALDO
 * un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
public class Voto {
    
    private Alumno alumno;
    private HashSet<Alumno> listVotos;

    public Voto() {
        listVotos=new HashSet();
    }

    public Voto(Alumno alumno, HashSet<Alumno> listVotos) {
        this.alumno = alumno;
        this.listVotos = listVotos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getListVotos() {
        return listVotos;
    }

    public void setListVotos(HashSet<Alumno> listVotos) {
        this.listVotos = listVotos;
    }

    @Override
    public String toString() {
        return "\nALUMNO VOTANTE:\t" + alumno + "----------LISTA DE VOTOS-----------\n" + listVotos;
    }

   

    
  
    
    
}
