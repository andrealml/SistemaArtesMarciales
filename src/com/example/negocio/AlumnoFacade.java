package com.example.negocio;

import com.example.datos.Alumno;
import com.example.datos.AlumnoFactory;

public class AlumnoFacade {
    private AlumnoService alumnoService;
    private SujetoRegistroAlumnos sujetoRegistro;

    public AlumnoFacade(AlumnoService alumnoService, SujetoRegistroAlumnos sujetoRegistro) {
        this.alumnoService = alumnoService;
        this.sujetoRegistro = sujetoRegistro;
        
        // Registrar el observador
        this.sujetoRegistro.agregarObservador(new ObservadorListaAlumnos());
    }

    public void registrarAlumno(String tipo, String nombre, String cinturon, boolean alDiaEnPagos) {
        Alumno alumno = AlumnoFactory.crearAlumno(tipo, nombre, cinturon, alDiaEnPagos);
        if (alumno != null) {
            alumnoService.registrarAlumno(alumno);
            sujetoRegistro.agregarAlumno(alumno);
        } else {
            System.out.println("Tipo de alumno no soportado.");
        }
    }

    public void mostrarListaAlumnos() {
        alumnoService.mostrarListaAlumnos();
    }
}
