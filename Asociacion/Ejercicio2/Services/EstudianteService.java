package Ejercicio2.Services;
import java.util.Date;

import Ejercicio2.Entidad.Estudiante;

public class EstudianteService {

    public Estudiante crearEstudiante(String nombre, Date fechaNacimiento, int materiasDesaprobadas, String interesesAcademicos) {
       
        return new Estudiante(nombre, fechaNacimiento, materiasDesaprobadas, interesesAcademicos);
    }
}


