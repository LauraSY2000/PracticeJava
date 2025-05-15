package Ejercicio1.ui;
import Ejercicio1.Entidad.*;
import Ejercicio1.Services.*;
import java.util.Scanner;
public class ConsolaUi {

    ServicesAutor servicesAutor = new ServicesAutor();
    ServicesLibro servicesLibro = new ServicesLibro();
    Scanner read = new Scanner(System.in);
    
    public void  iniciar (){
        System.out.println("Nuevo registro iniciado");

        System.out.println("Ingrese el nombre del autor");
        String nombreAutor = read.nextLine();
        Autor autor = servicesAutor.crearAutor(nombreAutor);
        System.out.println("Ingrese el nombre del libro");
        String nombreLibro=read.nextLine();
        System.out.println("ingrese el número de páginas");
        int numeroPaginas = read.nextInt();
        read.nextLine(); 
        System.out.println("Ingrese el año de publicación");
        int añoPublicacion = read.nextInt();

        Libro libro = servicesLibro.crearLibro(nombreLibro, numeroPaginas, añoPublicacion, autor);
        servicesLibro.InformacionLibro(libro);
    }
}


