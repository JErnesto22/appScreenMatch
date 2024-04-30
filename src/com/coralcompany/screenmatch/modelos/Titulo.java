package com.coralcompany.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String titulo;
    private int fechaDeLanzamiento;
    private int duracion;
    private boolean includidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    public Titulo(String titulo, int fechaDeLanzamiento) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;

        /*
        Constructor padre que recibe  el titulo y la fecha de lanzamiento
         */

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setIncludidoEnElPlan(boolean includidoEnElPlan) {
        this.includidoEnElPlan = includidoEnElPlan;
    }

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean isIncludidoEnElPlan() {
        return includidoEnElPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + titulo);
        System.out.println("Fue lanzada en: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracion());
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;

    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getTitulo().compareTo(otroTitulo.getTitulo());
    }
}
