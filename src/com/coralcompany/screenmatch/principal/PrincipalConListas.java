package com.coralcompany.screenmatch.principal;

import com.coralcompany.screenmatch.modelos.Pelicula;
import com.coralcompany.screenmatch.modelos.Serie;
import com.coralcompany.screenmatch.modelos.Titulo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula newPelicula = new Pelicula("Kung fu panda 1" , 2018);
        newPelicula.evalua(9);
        Serie casaDragon = new Serie("Casa Dragon" , 2022);
        casaDragon.evalua(9);
        Pelicula otherPelicula = new Pelicula("Sherk 2" , 2016);
       otherPelicula.evalua(9);
        var peliculaDeNeto = new Pelicula("Como entrenar a tu dragon." , 2016);
        peliculaDeNeto.evalua(9);




        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(newPelicula);
        lista.add(peliculaDeNeto);
        lista.add(otherPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getTitulo());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3){ //evalua si item es de tipo Pelicula y crea un valor llamado pelicula al cual le asigna el valor del item
                System.out.println(pelicula.getClasificacion());
            }

        }

        List<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Neto");
        listaDeArtistas.add("Ian David");
        listaDeArtistas.add("Juano");
        System.out.println("No ordenada" + listaDeArtistas);
        Collections.sort(listaDeArtistas); // ordena la lista por orden alfabetico
        System.out.println("lista ordenada" + listaDeArtistas);


        Collections.sort(lista);
        System.out.println("Titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento)); // Ordenando por fecha de lanzamiento
        System.out.println("Lista ordenanda por fecha: " + lista);
    }

}
