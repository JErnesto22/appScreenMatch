package com.coralcompany.screenmatch.modelos;

import com.coralcompany.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

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
}
