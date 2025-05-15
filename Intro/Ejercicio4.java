/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
 La fórmula correspondiente es: F = 32 + (9 * C / 5). */

 package Practico.Intro;

 import java.util.Scanner; 

 public class Ejercicio4 {

    public static void main (String [] args){

        Scanner leer = new Scanner (System.in);
        System.out.println ("Escribe los grados centrigrados para pasarlos a Farenheint");

        float C = leer.nextInt();
        float F = 32 + (9 * C / 5);
        System.out.println("Hola el resultado de " + C + " en Farenheint es " + F);
        leer.close();
    }
 }