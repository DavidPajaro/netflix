package com.secondweek.exercise;

/**
 * Clase Serie
 *
 * @author David Pajaro
 */
public class Serie extends Produccion implements IVisualizable {

    private int numTemporadas;
    private boolean visto;

    public Serie() {
        super();
        this.numTemporadas = 1;
        this.visto = false;
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
        this.numTemporadas = 1;
        this.visto = false;
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador, int duracion) {
        super(titulo, genero, creador, duracion);
        this.numTemporadas = numTemporadas;
        this.visto = false;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public String toString() {
        return "Serie{"
                + super.toString()
                + ", numTemporadas=" + numTemporadas
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
