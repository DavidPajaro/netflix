package com.secondweek.exercise;

/**
 * Clase Netflix
 *
 * @author David Pajaro
 */
public class Netflix {

    public static void main(String[] args) {

        Pelicula misPeliculas[] = new Pelicula[5];
        Serie misSeries[] = new Serie[5];

        System.out.println("****************** Lista de Peliculas y Series");
        for (int i = 0; i < 5; i++) {
            misPeliculas[i] = new Pelicula("Pelicula " + i, "Ciencia Ficcion", "Steven Spielberg", 2000 + i, 120);
            misSeries[i] = new Serie("Serie " + i, i, "Comedia", "Seth MacFarlane", 30);

            //Mostrar la lista de peliculas y series creadas
            System.out.println(misPeliculas[i].toString());
            System.out.println(misSeries[i].toString());
        }

        System.out.println("****************** Lista de Peliculas y Series marcadas como vistas");
        //Marcar peliculas y series como vistas
        misPeliculas[0].marcarVisto();
        System.out.println(misPeliculas[0].toString());
        misPeliculas[1].marcarVisto();
        System.out.println(misPeliculas[1].toString());
        misSeries[0].marcarVisto();
        System.out.println(misSeries[0].toString());

        //Marcar el tiempo visto (en minutos) en las peliculas y series marcadas como vistas
        misPeliculas[0].setTiempoVisualizacion(120);
        misPeliculas[1].setTiempoVisualizacion(45);
        misSeries[0].setTiempoVisualizacion(7);

        System.out.println("****************** Lista de Peliculas y Series marcadas como vistas y tiempo visualizadas");
        //Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos/segundos visualizados.
        for (int i = 0; i < 5; i++) {
            if (misPeliculas[i].esVisto()) {
                System.out.println("Se han visualizado " + misPeliculas[i].getTiempoVisualizacion() + " minutos de la pelicula: '" + misPeliculas[i].getTitulo() + "'");
            }
            if (misSeries[i].esVisto()) {
                System.out.println("Se han visualizado " + misSeries[i].getTiempoVisualizacion() + " minutos de la serie: '" + misSeries[i].getTitulo() + "'");
            }
        }

        System.out.println("****************** Mostrar la serie con mas temporadas");
        int maxTemporadas = misSeries[0].getNumTemporadas();
        int maxTemporadasSerie = 0;
        for (int i = 0; i < 5; i++) {
            if (misSeries[i].getNumTemporadas() > maxTemporadas) {
                maxTemporadas = misSeries[i].getNumTemporadas();
                maxTemporadasSerie = i;
            }
        }
        System.out.println(misSeries[maxTemporadasSerie].toString());

        System.out.println("****************** Mostrar la pelicula del año mas reciente");
        int maxReciente = misPeliculas[0].getAnio();
        int maxRecientePelicula = 0;
        for (int i = 0; i < 5; i++) {
            if (misPeliculas[i].getAnio() > maxReciente) {
                maxReciente = misPeliculas[i].getAnio();
                maxRecientePelicula = i;
            }
        }
        System.out.println(misPeliculas[maxRecientePelicula].toString());

    }

}
