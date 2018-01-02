package com.secondweek.exercise;

/**
 * Interfaz Visualizable
 *
 * @author David Pajaro
 */
public interface IVisualizable {

    /**
     * Cambia el atributo de visto a true.
     */
    public void marcarVisto();

    /**
     * Devuelve el estado del atributo visto.
     *
     * @return
     */
    public boolean esVisto();

    /**
     * Devuelve el tiempo en minutos que se visualizó el video.
     *
     * @return
     */
    public int tiempoVisto();

}
