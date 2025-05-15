package Ejercicio2.Entidad;

public class Clase {
    String nombre;
    int numeroEstudiantes;
    Estudiante [] estudiantes;
    public Clase() {
    }
    

    public Clase(String nombre, int numeroEstudiantes) {
        this.nombre = nombre;
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public Clase(String nombre, int numeroEstudiantes, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.numeroEstudiantes = numeroEstudiantes;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }
    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
}

