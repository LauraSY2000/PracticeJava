/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3, se solicita escribir un programa en
 el cual se compruebe si la matriz P está contenida dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices
  de 3x3 que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una que coincida con la matriz P. 
  En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual empieza el primer elemento de la submatriz P. 
 */
package Practico.Intro;

public class Ejercicio21 {
    public static void main(String[] args) {
        int L = 9;
        int l = 4;
        int matrizA[][] = new int[L][L];
        int matrizB[][] = new int[l][l];

        rellenarMatriz(matrizA);
        System.out.println("///////////////////////");
        rellenarMatriz(matrizB);
        System.out.println("///////////////////////");
        buscarMatriz(matrizA, matrizB);

    }

    public static void rellenarMatriz(int matriz[][]) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = contador++;
                if (contador > 4) {
                    contador = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void buscarMatriz (int matrizA[][], int matrizB[][]) {
        int l = matrizB.length;
        int L = (matrizA.length-l+1);
        boolean verificar = true;

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < L; j++) {
                verificar = true;
                if (matrizA[i][j] == matrizB[0][0]){
                    for (int m = 0; m < l; m++) {
                        for (int n = 0; n <l; n++) {
                            if (matrizA[i+m][j+n] != matrizB[m][n]){
                                verificar = false;
                                break;}
                        }
                        if (verificar==false){
                            break;
                        }

                    }
                    if (verificar == true) {
                        System.out.println("La matriz B inicia en la matriz A ["+ i +"]" + "[" + j + "]");
                    }

                }

                }

            }
            
        }

    }

