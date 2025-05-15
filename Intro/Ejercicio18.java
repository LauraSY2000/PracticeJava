/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
*/
package Practico.Intro;

import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        System.out.println("Matriz A");
        rellenarMatriz(matriz);
        System.out.println("Matriz B");

        revertirMatriz(matriz);

    }

    public static void rellenarMatriz(int matriz[][]) {
        Random randomNumbers = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = randomNumbers.nextInt(0, 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }

    }

    public static void revertirMatriz (int matriz [][]){
        int matrizB [][] = new int [4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizB [i][j] = matriz [j][i];
                System.out.print( matrizB [i][j] + " ");
            }
            System.out.println("");
        }
    }
}
