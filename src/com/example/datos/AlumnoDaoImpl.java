package com.example.datos;

import java.util.HashMap;
import java.util.Map;

public class AlumnoDaoImpl implements AlumnoDao {
    private Map<String, Alumno> alumnos = new HashMap<>();

    @Override
    public void agregarAlumno(Alumno alumno) {
        alumnos.put(alumno.getNombre(), alumno);
    }

    @Override
    public void mostrarListaAlumnos() {
        System.out.println("Lista de Alumnos inscritos:");
        for (Alumno alumno : alumnos.values()) {
            System.out.println("- " + alumno.getNombre() + " (" + alumno.getCinturon() + ")");
        }
    }
}