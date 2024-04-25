package com.coralcompany.screenmatch.calculos;

public class FiltroRecomendacion {

    //La clase se usa para filtrar por medio de las visualizaciones para recomendar o no una  pelicula
    // Clasificacion clasificacion indica que un dato llamado clasificacion es del tipo Clasificacion para poder tener acceso a sus metodos
   public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento!");
        } else if(clasificacion.getClasificacion() >= 2){
            System.out.println("Popular por el momento");
        } else {
            System.out.println("Colocalo en tu lista para verlo despues.");

        }
    }
}
