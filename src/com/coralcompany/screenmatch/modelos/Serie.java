package com.coralcompany.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String titulo, int fechaDeLanzamiento) {
        super(titulo, fechaDeLanzamiento);
        //constructor que llama al constructor de la clase padre
    }

    @Override
    public int getDuracion() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public Serie setTemporadas(int temporadas) {
        this.temporadas = temporadas;
        return this;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public Serie setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
        return this;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public Serie setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
        return this;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getTitulo() + " (" + this.getFechaDeLanzamiento() + ") ";
    }
}
