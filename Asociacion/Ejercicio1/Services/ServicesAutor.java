package Ejercicio1.Services;
import Ejercicio1.Entidad.Autor;


public class ServicesAutor {
    public  Autor crearAutor(String nombre) {
        return new Autor(nombre);
         
    }
}
