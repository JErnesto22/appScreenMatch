package com.coralcompany.screenmatch.modelos;

public class Pelicula extends Titulo {
    private String director;

    public String getDirector() {
        return director;
    }

    public Pelicula setDirector(String director) {
        this.director = director;
        return this;
    }
}
