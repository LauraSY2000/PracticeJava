package Ejercicio2.Services;
import Ejercicio2.Entidad.*;

public class ClaseService {
    EstudianteService estudianteService = new EstudianteService();

    public Clase crearClase(String nombre, int numeroEstudiantes) {
        
        Estudiante estudiantes [] = new Estudiante [numeroEstudiantes];

        return new Clase(nombre, numeroEstudiantes, estudiantes);
    }

    public void agregarEstudiante(Clase clase, Estudiante estudiante) {
        Estudiante [] estudiantes = clase.getEstudiantes(); 

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes [i] == null) {
                estudiantes [i] = estudiante;
                break;
            }
        }
    }
    public void listarEstudiante (Clase clase) {
        for (int i = 0; i < clase.getNumeroEstudiantes(); i++) {
            System.out.println("Estudiante " + (i+1) + clase.getEstudiantes()[i]);
            
        }
    }
    
    
}
