/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una matriz A es anti simétrica cuando ésta es igual
 a su propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se denota 
 por AT y se obtiene cambiando sus filas por columnas (o viceversa). */
package Practico.Intro;

import java.util.Scanner;
import java.util.List;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<Integer> listaA = List.of(0, -2, 4, 2, 0,2, -4, -2, 0);
        List<Integer> listaB = List.of(0, 2, -4, -2, 0, -2, 4, 2, 0);

        System.out.println("ingrese el tamaño de las matrices a comparar");
        int tamaño = leer.nextInt();
        int matrizA[][] = new int[tamaño][tamaño];
        int matrizB[][] = new int[tamaño][tamaño];

        System.out.println("Ingrese los datos de la primera matriz");
        rellenarMatriz(matrizA, listaA);
        System.out.println("Ingrese los datos de la segunda matriz");
        rellenarMatriz(matrizB, listaB);
        verificarAntisimetria(matrizA, matrizB);
        leer.close();

    }

    public static void rellenarMatriz(int matriz[][], List<Integer> lista) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = lista.get(contador++);
                System.out.print( matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /*
     * public static void rellenarMatriz(int matriz[][]) {
     * Scanner leer = new Scanner(System.in);
     * for (int i = 0; i < matriz.length; i++) {
     * for (int j = 0; j < matriz.length; j++) {
     * matriz[i][j] = leer.nextInt();
     * }
     * }
     * }
     */
    public static void verificarAntisimetria(int matrizA[][], int matrizB[][]) {
        boolean esAntisimetrica = true;
        int numB = 0;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                numB =  (matrizB[i][j]*-1);

                System.out.println(matrizA[i][j] + " == " + numB);

                if (matrizA[i][j] != numB) { // Se verifica A[i][j] = -B[j][i]
                    esAntisimetrica = false;
                }
            }
        }

        if (esAntisimetrica) {
            System.out.println("Las matrices son antisimétricas.");
        } else {
            System.out.println("Las matrices NO son antisimétricas.");
        }
    }

    /*public static void verificarSimetria(int matrizA[][], int matrizB[][]) {
        boolean check = true;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.println((matrizA[i][j]) + " == " + (matrizB[j][i]));

                if (matrizA[i][j] != matrizB[j][i]) {
                    check = false;
                }
            }
            if (!check) {
                break;
            }
        }
        if (check == true) {
            System.out.println("Son antisimetricas");
        } else {
            System.out.println("Las matrices no son antisimetricas");
        }

    }*/
}
