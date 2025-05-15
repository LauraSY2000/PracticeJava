/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que 
 los números introducidos son correctos, es decir, están entre el 1 y el 9. */
package Practico.Intro;

import java.util.List;

public class Ejercicio20 {
    public static void main(String[] args) {
        List<Integer> numerosMagicos = List.of(2, 7, 6,
                                            9, 5, 1,
                                            4, 3, 8);
        int matriz[][] = new int[3][3];
        rellenarMatriz(matriz, numerosMagicos);
        if (comprobarMatrizMagica (matriz)){
            System.out.println("La matriz es mágica");}
            else { System.out.println("La matriz no es mágica");

            }
        }

    public static void rellenarMatriz(int matriz[][], List<Integer> numerosMagicos) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numerosMagicos.get(contador++);
            }
        }
    }

    public static boolean comprobarFilas(int matriz[][]) {
        boolean verificaFilas = true;
        for (int i = 0; i < matriz.length; i++) {
            int contador = 0;
            for (int j = 0; j < matriz.length; j++) {
                contador += matriz[i][j];
            }
            if (contador != 15) {
                verificaFilas = false;
                break;
            }
        }
        return verificaFilas;
    }
    public static boolean comprobarColumnas(int matriz[][]) {
        boolean verificaColumnas = true;
        for (int i = 0; i < matriz.length; i++) {
            int contador = 0;
            for (int j = 0; j < matriz.length; j++) {
                contador += matriz[j][i];
            }
            if (contador != 15) {
                verificaColumnas = false;
                break;
            }
            
        }
        return verificaColumnas;
    }

    public static boolean comprobarDiagonalPrincipal (int matriz[][]) {
        boolean verificarDP = true;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            contador += matriz [i][i];    
        }
        if (contador != 15) {
            verificarDP = false;
        }
        return verificarDP;
    }
    public static boolean comprobarDiagonalSecundaria (int matriz[][]) {
        boolean verificarDP = true;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            int j = ((matriz.length)-1-i);
            contador += matriz [i][(j)];
        }
        if (contador != 15) {
            verificarDP = false;
        }
        return verificarDP;
    }

    public static boolean comprobarMatrizMagica (int matriz[][]){
        boolean verificacion = true;
        if  (!comprobarFilas(matriz) || !comprobarColumnas(matriz) || !comprobarDiagonalPrincipal(matriz) || !comprobarDiagonalSecundaria(matriz)){
            verificacion = false;
        }
    
        return verificacion;
    }


}
