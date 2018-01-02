package com.secondweek.exercise;

/**
 * Clase Pelicula
 *
 * @author David Pajaro
 */
public class Pelicula extends Produccion implements IVisualizable {

    private int anio;
    private boolean visto;

    public Pelicula() {
        super();
        this.visto = false;
    }

    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
        this.visto = false;
    }

    public Pelicula(String titulo, String genero, String creador, int anio, int duracion) {
        super(titulo, genero, creador, duracion);
        this.anio = anio;
        this.visto = false;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Pelicula{"
                + super.toString()
                + ", año=" + anio
                + ", visto=" + visto
                + '}';
    }

    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public int tiempoVisto() {
        //En minutos
        return getTiempoVisualizacion();
    }

}
