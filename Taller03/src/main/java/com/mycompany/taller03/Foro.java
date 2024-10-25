/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller03;

/**
 *
 * @author cesar
 */
public class Foro {
    private String id;
    private String Tematica;
    private int numDeComentarios;
    private Curso curso;

    public Foro(String id, String Tematica, int numDeComentarios, Curso curso) {
        this.id = id;
        this.Tematica = Tematica;
        this.numDeComentarios = numDeComentarios;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
     
    
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTematica() {
        return Tematica;
    }
    public void setTematica(String tematica) {
        Tematica = tematica;
    }
    public int getNumDeComentarios() {
        return numDeComentarios;
    }
    public void setNumDeComentarios(int numDeComentarios) {
        this.numDeComentarios = numDeComentarios;
    }

    
}
