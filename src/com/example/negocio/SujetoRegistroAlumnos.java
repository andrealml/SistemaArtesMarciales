package com.example.negocio;

import com.example.datos.Alumno;
import java.util.ArrayList;
import java.util.List;

public class SujetoRegistroAlumnos {
    private List<Observador> observadores = new ArrayList<>();
    private List<Alumno> listaAlumnos = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(listaAlumnos);
        }
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
        notificarObservadores();
    }
}