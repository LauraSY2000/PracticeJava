package Practico.POO.Ejercicio2.Servicio;

import Practico.POO.Ejercicio2.Entidad.Circunferencia;
import java.util.Scanner;
import java.math.*;

public class ServicesCircunferencia {

    public void mostrarObjeto (Circunferencia c) {
    System.out.println("El radio es " + c.getRadio());     
}
    public Circunferencia llenarCirculo (Circunferencia c) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el radio de la Circunferencia");
        c.setRadio(leer.nextFloat());
        return c;
    }
    public float area (Circunferencia c) {
        return (float) Math.PI * c.getRadio ()* c.getRadio ();
    }

    public float perimetro (Circunferencia c) {
        return (float) Math.PI * 2 *c.getRadio();
    }

}