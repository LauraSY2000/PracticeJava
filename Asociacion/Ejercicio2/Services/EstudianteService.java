package Ejercicio2.Services;

import Ejercicio2.Entidad.Estudiante;

public class EstudianteService {

    public Estudiante crearEstudiante(String nombre, String fechaNacimiento, int materiasDesaprobadas, String interesesAcademicos) {
       
        return new Estudiante(nombre, fechaNacimiento, materiasDesaprobadas, interesesAcademicos);
    }
}


