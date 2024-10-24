package com.mycompany.taller03;

public class Profesor extends Personal_Academico{

    public Profesor(String Usuario, String contrasenia, String nombre, String apellido) {
        super(Usuario, contrasenia, nombre, apellido);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa ActividadSumativa){
        /*aqui va codigo */
    }

    public void calificarActividadSumativa(Curso curso,Estudiante estudiante, ActividadSumativa ActividadSumativa){
        /*aqui va codigo */
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        /*aqui va codigo */
    }

    public void crearNuevoForo(Foro foro){
        /*aqui va codigo */
    }
}
