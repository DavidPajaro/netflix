package com.secondweek.exercise;

/**
 * Clase Produccion
 *
 * @author David Pajaro
 */
public class Produccion {

    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    //El tiempo de visualizacion es en minutos
    private int tiempoVisualizacion;

    public Produccion() {
    }

    public Produccion(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Produccion(String titulo, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTiempoVisualizacion() {
        return tiempoVisualizacion;
    }

    public void setTiempoVisualizacion(int tiempoVisualizacion) {
        this.tiempoVisualizacion = tiempoVisualizacion;
    }

    @Override
    public String toString() {
        return "Produccion{"
                + "titulo=" + titulo
                + ", genero=" + genero
                + ", creador=" + creador
                + ", duracion=" + duracion
                + ", tiempoVisualizacion=" + tiempoVisualizacion
                + '}';
    }

}
