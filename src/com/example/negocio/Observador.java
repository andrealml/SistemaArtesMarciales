package com.example.negocio;

import com.example.datos.Alumno;
import java.util.List;

public interface Observador {
    void actualizar(List<Alumno> listaAlumnos);
}