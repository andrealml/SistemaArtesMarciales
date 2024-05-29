package com.example.datos;

public class AlumnoTaekwondo extends Alumno {
    private String nombre;
    private String cinturon;
    private boolean alDiaEnPagos;

    public AlumnoTaekwondo(String nombre, String cinturon, boolean alDiaEnPagos) {
        this.nombre = nombre;
        this.cinturon = cinturon; 
        this.alDiaEnPagos = alDiaEnPagos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getCinturon() {
        return cinturon;
    }

    @Override
    public boolean estaAlDiaEnPagos() {
        return alDiaEnPagos;
    }
}