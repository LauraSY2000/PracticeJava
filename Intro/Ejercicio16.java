/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario un numero a buscar en el vector.
El programa mostrará donde se encuentra el numero y si esta repetido*/

package Practico.Intro;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el tamaño del vector");
        int tamaño = leer.nextInt();
        System.out.println("Escribe el número a buscar en el vector");
        int busqueda = leer.nextInt();
        leer.close();
        int vector[] = new int[tamaño];
        vector = llenarVector(vector);
        buscarVector(busqueda, vector);

    }

    public static int[] llenarVector(int vector[]) {

        Random randomNumbers = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = randomNumbers.nextInt(1, 4);
            System.out.println(vector[i]);
        }
        return vector;
    }

    public static void buscarVector(int busqueda, int vector[]) {

        int contador = 0;
        String posiciones = "";

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == busqueda) {
                contador++;
                posiciones += i + ", ";
            }
        }
        if (contador == 0) {
            System.out.println("El número no se encuentra en el vector");
        } else if (contador > 1) {
            System.out
                    .println("El número " + busqueda + " se repitió " + contador + " veces en las posiciones " + posiciones);


        } else {
            System.out.println("El número aparece una única vez en el vector en la posición " + posiciones);
        }


    }
}
