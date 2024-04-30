package com.coralcompany.screenmatch.principal;

import com.coralcompany.screenmatch.calculos.CalculadoraDeTiempo;
import com.coralcompany.screenmatch.calculos.FiltroRecomendacion;
import com.coralcompany.screenmatch.modelos.Episodio;
import com.coralcompany.screenmatch.modelos.Pelicula;
import com.coralcompany.screenmatch.modelos.Serie;
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {

        Pelicula newPelicula = new Pelicula("Kung fu panda 1" , 2018);
        newPelicula.setDuracion(128);
        newPelicula.setIncludidoEnElPlan(true);

        newPelicula.muestraFichaTecnica();

        newPelicula.evalua(9.9);
        newPelicula.evalua(9.4);
        newPelicula.evalua(8.4);
        System.out.println("*");
        System.out.println(newPelicula.getTotalDeEvaluaciones());
        System.out.println("*");
        System.out.println(newPelicula.calculaMedia());
        System.out.println(newPelicula.getTitulo());

        Serie casaDragon = new Serie("Casa Dragon" , 2022);

        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(58);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracion());

        Pelicula otherPelicula = new Pelicula("Sherk 2" , 2016);

        otherPelicula.setDuracion(132);
        otherPelicula.setIncludidoEnElPlan(false);

        otherPelicula.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(newPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otherPelicula);
        System.out.println("El tiempo necesario para ver tus titulos favoritos es: " +
                calculadora.getTiempoTotal() + " minutos");


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(newPelicula);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("The mentalist");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeNeto = new Pelicula("Como entrenar a tu dragon." , 2016);
        peliculaDeNeto.setDuracion(124);


        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(newPelicula);
        listaDePeliculas.add(peliculaDeNeto);
        listaDePeliculas.add(otherPelicula);

        System.out.println("El tamaño de la lista es de: " + listaDePeliculas.size());
        System.out.println("La primera pelicua es: " + listaDePeliculas.get(0).getTitulo());
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula " + listaDePeliculas.get(0).toString());




    }



    }

