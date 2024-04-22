package com.coralcompany.screenmatch.calculos;
import com.coralcompany.screenmatch.modelos.Pelicula;
import com.coralcompany.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracion();
    }

}
