package Ejercicio1.Entidad;

public class Libro {
    String nombre;
    int numPaginas;
    Autor autor;
    int añoPublicacion;
    public Libro() {
    }
    public Libro(String nombre, int numPaginas, Autor autor, int añoPublicacion) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    public String getResumen() {
        return "Nombre: " + nombre + " Número de páginas: " + numPaginas + " Año de publicación: " + añoPublicacion + " Autor: " + autor.getNombre();
    }

    
}
