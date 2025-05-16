package Ejercicio2.Entidad;


public class Estudiante {
    String nombre; 
    String fechaNacimiento;
    int materiasDesaprobadas;
    String interesesAcademicos;
    public Estudiante() {
    }
    public Estudiante(String nombre, String fechaNacimiento, int materiasDesaprobadas, String interesesAcademicos) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.materiasDesaprobadas = materiasDesaprobadas;
        this.interesesAcademicos = interesesAcademicos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getMateriasDesaprobadas() {
        return materiasDesaprobadas;
    }
    public void setMateriasDesaprobadas(int materiasDesaprobadas) {
        this.materiasDesaprobadas = materiasDesaprobadas;
    }
    public String getInteresesAcademicos() {
        return interesesAcademicos;
    }
    public void setInteresesAcademicos(String interesesAcademicos) {
        this.interesesAcademicos = interesesAcademicos;
    }
    @Override
    public String toString() {
        return " Nombre " + nombre + " Fecha de Nacimiento " + fechaNacimiento + " Intereses acádemicos " + interesesAcademicos + " Materias reprobadas " + materiasDesaprobadas;
    }
    
}



