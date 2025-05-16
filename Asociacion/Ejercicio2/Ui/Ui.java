package Ejercicio2.Ui;

import Ejercicio2.Services.*;
import Ejercicio2.Entidad.*;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;


public class Ui {

    Scanner read = new Scanner(System.in);
    ClaseService claseService = new ClaseService();
    EstudianteService estudianteService = new EstudianteService();
    Clase clase = iniciarClase();

     public void menu() {

        String opcion = "";
        while (!opcion.toUpperCase().equals("C")) {
            System.out.println(
                    "Digite a, b ó c dependiendo de la opción que quiera desarrollar siendo (A) crear estudiante (el estudiante automaticamente se agregara al grupo creado inicialmente) (B) listar clase o (C) detener proceso");
            opcion = read.nextLine();
            switch (opcion.toUpperCase()) {
                case "A":
                    Estudiante estudiante = crearEstudiante();
                    agregarEstudiante(estudiante, clase);
                    break;
                case "B":
                    System.out.println("Listando estudiantes registrados en la clase " + clase.getNombre());
                    claseService.listarEstudiante(clase);
                    break;
                case "C":
                    System.out.println("Finalizando proceso...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        }

    }

    public Clase iniciarClase() {
        System.out.println("Iniciando clase. por favor ingrese el nombre de la clase");
        String nombreClase = read.nextLine();
        System.out.println("Escriba el número de estudiantes");
        int numeroEstudiantes = read.nextInt();
        read.nextLine();
        System.out.println("______Clase iniciada__");
        return claseService.crearClase(nombreClase, numeroEstudiantes);
    }

    public Estudiante crearEstudiante() {
        System.out.println("Iniciando proceso de creación del estudiante");
        System.out.println("Essriba el nombre de estudiante");
        String nombreEstudiante = read.nextLine();
        System.out.println("Escriba la fecha de nacimiento del estudiante en el siguiente formado dd/mm/aaaa");
        String fechaNacimiento = read.nextLine();
        System.out.println("Escriba el nombre los intereses academicos del estudiante");
        String interesesAcademicos = read.nextLine();
        System.out.println("Escriba el numero de materias desaprobadas");
        int materiasDesaprobadas = read.nextInt();
        read.nextLine();
        return estudianteService.crearEstudiante(nombreEstudiante, fechaNacimiento, materiasDesaprobadas,
                interesesAcademicos);
    }

    public void agregarEstudiante(Estudiante estudiante, Clase clase) {
        claseService.agregarEstudiante(clase, estudiante);
    }

}
