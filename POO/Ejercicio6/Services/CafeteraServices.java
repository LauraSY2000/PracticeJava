package Practico.POO.Ejercicio6.Services;

import Practico.POO.Ejercicio6.Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServices {
    Scanner read = new Scanner(System.in);

    public Cafetera crearCafetera() {
        float capacidadM, cantidadA;

        do {
            System.out.println("Recuerde que el valor maximo no debe superar la cantidad de cafe en la cafetera");
            System.out.println("¿Cuál es la capacidad máxima de la cafetera?");
            capacidadM = read.nextFloat();
            System.out.println("¿Cuál es la cantidad de café en la cafetera? ");
            cantidadA = read.nextFloat();
        } while (capacidadM < 0 || capacidadM < cantidadA);

        Cafetera cafetera = new Cafetera(capacidadM, cantidadA);

        return cafetera;

    }

    public Cafetera llenarCafetera(Cafetera a) {
        a.setCantidadActual(a.getCapacidadMaxima());
        return a;
    }

    public Cafetera servirTaza(int taza, Cafetera c) {
        if (taza < c.getCantidadActual()) {
            c.setCantidadActual(c.getCantidadActual() - taza);
            System.out.println("Taza servida. La cantidad actual de café es " + c.getCantidadActual());

        } else {
            System.out.println("No había suficiente café, quedaron faltando" + (taza - c.getCantidadActual()));
            c.setCantidadActual(0);
        }
        return c;

    }

    public Cafetera vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
        return c;
    }
    public Cafetera agregarCafe(int cafeAgregado, Cafetera c) {
        c.setCantidadActual(c.getCantidadActual()+cafeAgregado);
        return c;
    }
}
