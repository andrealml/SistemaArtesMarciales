package com.example.negocio;

import com.example.datos.Alumno;
import java.util.List;

public class ObservadorListaAlumnos implements Observador {
    @Override
    public void actualizar(List<Alumno> listaAlumnos) {
        System.out.println("Se ha actualizado la lista de alumnos:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println("- " + alumno.getNombre() + " (" + alumno.getCinturon() + ")");
        }
    }
}