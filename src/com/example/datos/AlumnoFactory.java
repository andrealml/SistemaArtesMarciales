package com.example.datos;

public class AlumnoFactory {
    public static Alumno crearAlumno(String tipo, String nombre, String cinturon, boolean alDiaEnPagos) {
        if (tipo.equals("Taekwondo")) {
            return new AlumnoTaekwondo(nombre, cinturon, alDiaEnPagos);
        } else {
            // Agregar más tipos de alumnos según sea necesario
            return null;
        }
    }
}