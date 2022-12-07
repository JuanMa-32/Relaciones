/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author NALDO
 * de las películas nos interesa saber
el título, duración, edad mínima y director.
 */
public class Pelicula {
    
    private String titulo;
    private int duracion;
    private int edadMin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
     public void film(){
        
        
        titulo="rocky";
        duracion=2;
        edadMin=14;
        director="John G. Avildsen";
     
    }

    @Override
    public String toString() {
        return  "Titulo:\t" + titulo + "\n Duracion:\t" + duracion + "\n Edad Minima:\t" + edadMin + "\n Director:\t" + director;
    }
    
    
}
