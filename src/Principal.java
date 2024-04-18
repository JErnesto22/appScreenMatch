public class Principal {
    public static void main(String[] args) {
        Pelicula newPelicula = new Pelicula();

        newPelicula.titulo = "Kung fu panda";
        newPelicula.fechaDeLanzamiento = 2018;
        newPelicula.duracion = 128;
        newPelicula.includidoEnElPlan = true;

        newPelicula.muestraFichaTecnica();
        newPelicula.evalua(9.9);
        newPelicula.evalua(9.4);
        newPelicula.evalua(8.4);
        System.out.println(newPelicula.totalDeEvaluaciones);
        System.out.println(newPelicula.sumaDeLasEvaluaciones);
        System.out.println(newPelicula.calculaMedia());

        Pelicula otherPelicula = new Pelicula();
        otherPelicula.titulo = "Sherk 2";
        otherPelicula.fechaDeLanzamiento = 2016;
        otherPelicula.duracion = 132;
        otherPelicula.includidoEnElPlan = false;

      //  otherPelicula.muestraFichaTecnica();



    }
}
