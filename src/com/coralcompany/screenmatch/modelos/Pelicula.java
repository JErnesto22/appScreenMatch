package com.coralcompany.screenmatch.modelos;

import com.coralcompany.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;


       /*
       public Pelicula(String nombre) {
       this.setTitulo(nombre);
       Constructor para asignar de forma automatica el nombre a una
       pelicula dentro de los parentesis del constuctor

       #Ejemplo
         Pelicula nuevaPelicula = new Pelicula("Star wars");
        */


    public Pelicula(String titulo, int fechaDeLanzamiento) {
        super(titulo, fechaDeLanzamiento);

        //constructor que llama al constructor de la clase padre
    }

    public String getDirector() {
        return director;
    }

    public Pelicula setDirector(String director) {
        this.director = director;
        return this;
    }


    @Override
    public int getClasificacion() {
        return (int)calculaMedia()/2;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getTitulo() + " (" + getFechaDeLanzamiento() + ")";
        //SObre escribiendo el metodo to string de la clase Object para poder usarlo al mostrar las peliculas de un arrayList
    }
}
