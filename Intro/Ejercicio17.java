/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)*/
package Practico.Intro;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        leer.close();
        int vector[] = new int[tamaño];
        llenarVector(vector);
        comprobarVector(vector);

    }

    // llenar vector
    public static void llenarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i * i;
            System.out.print(vector[i] + "  ");
        }
    }

    // Recorrer vector y comprobar repeticiones
    public static void comprobarVector(int vector[]) {
        int divisor = 10;
        String registroContador = "";
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            contador = 0;
            for (int j = 0; j < vector.length; j++) {
                int num = Math.abs(vector[j]);
                if ((num / divisor) < 1 && num >= divisor / 10) {
                    contador++;
                }
                if (num == 0 && divisor == 10) {
                    contador++;
                }
            }
            registroContador += contador + " // ";
            divisor *= 10;

        }
        System.out.println(
                "La cantidad de números con 1 digito // 2 digitos // 3 digitos // cuatro digitos // cinco digitos son:");
        System.out.println(registroContador);
    }

}
