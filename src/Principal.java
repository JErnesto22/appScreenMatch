import com.coralcompany.screenmatch.calculos.CalculadoraDeTiempo;
import com.coralcompany.screenmatch.modelos.Pelicula;
import com.coralcompany.screenmatch.modelos.Serie;

import java.util.concurrent.Callable;

public class Principal {
    public static void main(String[] args) {

        Pelicula newPelicula = new Pelicula();

        newPelicula.setTitulo("Kung fu panda 1");
        newPelicula.setFechaDeLanzamiento(2018);
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

        Serie casaDragon = new Serie();


        casaDragon.setTitulo("Casa Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(58);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracion());

        Pelicula otherPelicula = new Pelicula();
        otherPelicula.setTitulo("Sherk 2");
        otherPelicula.setFechaDeLanzamiento(2016);
        otherPelicula.setDuracion(132);
        otherPelicula.setIncludidoEnElPlan(false);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(newPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otherPelicula);
        System.out.println("El tiempo necesario para ver tus titulos favoritos es: " +
                calculadora.getTiempoTotal() + " minutos");


        };












    }

