package com.example.presentacion;

import com.example.negocio.AlumnoFacade;
import com.example.negocio.AlumnoService;
import com.example.negocio.AlumnoServiceImpl;
import com.example.negocio.SujetoRegistroAlumnos;
import com.example.datos.AlumnoDaoImpl;
import java.util.Scanner;

public class SistemaArtesMarcialesUI {
    private AlumnoFacade alumnoFacade;
    private Scanner scanner = new Scanner(System.in);

    public SistemaArtesMarcialesUI() {
        AlumnoService alumnoService = new AlumnoServiceImpl(new AlumnoDaoImpl());
        SujetoRegistroAlumnos sujetoRegistro = new SujetoRegistroAlumnos();
        this.alumnoFacade = new AlumnoFacade(alumnoService, sujetoRegistro);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("1. Registrar Alumno");
            System.out.println("2. Mostrar Lista de Alumnos");
            System.out.println("3. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registrarAlumno();
                    break;
                case 2:
                    mostrarListaAlumnos();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private void registrarAlumno() {
        System.out.println("Ingrese el tipo de Alumno (Taekwondo):");
        String tipo = scanner.nextLine();
        System.out.println("Ingrese el nombre del Alumno:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el cinturón del Alumno:");
        String cinturon = scanner.nextLine();
        System.out.println("Está al día en pagos (true/false):");

        boolean alDiaEnPagos = false;
        while (true) {
            String alDiaEnPagosInput = scanner.nextLine();
            if (alDiaEnPagosInput.equalsIgnoreCase("true")) {
                alDiaEnPagos = true;
                break;
            } else if (alDiaEnPagosInput.equalsIgnoreCase("false")) {
                alDiaEnPagos = false;
                break;
            } else {
                System.out.println("Entrada inválida. Por favor ingrese 'true' o 'false':");
            }
        }

        alumnoFacade.registrarAlumno(tipo, nombre, cinturon, alDiaEnPagos);
        System.out.println("Alumno registrado exitosamente.");
    }

    private void mostrarListaAlumnos() {
        alumnoFacade.mostrarListaAlumnos();
    }

    public static void main(String[] args) {
        new SistemaArtesMarcialesUI().mostrarMenu();
    }
}
