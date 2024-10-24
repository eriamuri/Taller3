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
public class Tarea extends ActividadSumativa{
    private Date fechaDePublicacion;
    
    public Tarea(String titulo, Date fechaEntrega, float puntajeMaximo, String contenido, float calificacion, String id,
            Date fechaDePublicacion) {
        super(titulo, fechaEntrega, puntajeMaximo, contenido, calificacion, id);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    

}
