package Ejercicio1.Services;
import Ejercicio1.Entidad.Libro;
import Ejercicio1.Entidad.Autor;


public  class ServicesLibro {
    public Libro crearLibro(String nombre, int numPaginas, int añoPublicacion, Autor autor) {

        return new Libro(nombre, numPaginas, autor, añoPublicacion);
    }

    public void InformacionLibro (Libro libro) {
        System.out.println(libro.getResumen());
    }

}