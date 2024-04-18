public class Pelicula {
    String titulo;
    int fechaDeLanzamiento;
    int duracion;
    boolean includidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + titulo);
        System.out.println("Fue lanzada en: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracion);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;

    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }

}
