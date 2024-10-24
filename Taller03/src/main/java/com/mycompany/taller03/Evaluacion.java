/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

import java.util.Date;

/**
 *
 * @author cesar
 */
public class Evaluacion extends ActividadSumativa{
    private int limiteDeTiempo;

    public Evaluacion(String titulo, Date fechaEntrega, float puntajeMaximo, String contenido, float calificacion,
            String id, int limiteDeTiempo) {
        super(titulo, fechaEntrega, puntajeMaximo, contenido, calificacion, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    public int getLimiteDeTiempo() {
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }

}
