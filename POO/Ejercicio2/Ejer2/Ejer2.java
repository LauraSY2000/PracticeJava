package Practico.POO.Ejercicio2.Ejer2;

import Practico.POO.Ejercicio2.Entidad.Circunferencia;
import Practico.POO.Ejercicio2.Servicio.ServicesCircunferencia; 
public class Ejer2 {
   
    public static void main(String[] args) {

        Circunferencia circulo1 = new Circunferencia(0);
        ServicesCircunferencia service = new ServicesCircunferencia();
        service.llenarCirculo(circulo1);
        service.mostrarObjeto(circulo1); // Mostrar el objeto
        System.out.println(" Su area es " + service.area(circulo1));
        System.out.println("Su perimetro es " + service.perimetro(circulo1));
        }
}
