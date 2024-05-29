package com.example.negocio;

import com.example.datos.Alumno;
import com.example.datos.AlumnoDao;

public class AlumnoServiceImpl implements AlumnoService {
    private AlumnoDao alumnoDao;

    public AlumnoServiceImpl(AlumnoDao alumnoDao) {
        this.alumnoDao = alumnoDao;
    }

    @Override
    public void registrarAlumno(Alumno alumno) {
        alumnoDao.agregarAlumno(alumno);
    }

    @Override
    public void mostrarListaAlumnos() {
        alumnoDao.mostrarListaAlumnos();
    }
}