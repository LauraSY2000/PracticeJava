/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * * 
*/
package Practico.Intro;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba los N lados del cuadrado");
        int n = leer.nextInt();
        leer.close();

        // linea superior
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        // lineas intermedias

        for (int i = 0; i < (n - 2); i++) {
            System.out.print("* ");
            for (int j = 0; j < (n - 2); j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        // linea inferior
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

    }
}