package com.mycompany.taller03;

import java.util.ArrayList;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantesInscritos;
    private ArrayList<Estudiante> estudiantesEnEspera;
    private ArrayList<ActividadSumativa> actividadesSumativas;

    public Curso(String id, String nombre, boolean estadoDisponible, Profesor profesor, ArrayList<Estudiante> estudiantesInscritos, ArrayList<Estudiante> estudiantesEnEspera, ArrayList<ActividadSumativa> actividadesSumativas) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.profesor = profesor;
        this.estudiantesInscritos = estudiantesInscritos;
        this.estudiantesEnEspera = estudiantesEnEspera;
        this.actividadesSumativas = actividadesSumativas;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public ArrayList<Estudiante> getEstudiantesEnEspera() {
        return estudiantesEnEspera;
    }

    public void setEstudiantesEnEspera(ArrayList<Estudiante> estudiantesEnEspera) {
        this.estudiantesEnEspera = estudiantesEnEspera;
    }

    public ArrayList<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }

    public void setActividadesSumativas(ArrayList<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    
}


