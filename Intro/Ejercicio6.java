/*Crear un programa que dado un numero determine si es par o impar. */
package Practico.Intro;

import java.util.Scanner; 
public class Ejercicio6{
    /**
     * @param args
     */
    public static void main (String [] args) {
Scanner leer = new Scanner (System.in); 

System.out.println("Escribe un número para determinar si es par");
int numero = leer.nextInt();

int cociente = numero % 2; 

if (cociente == 0) {
    System.out.println("El número es par");
    }
    else {
        System.out.println("El número es impar");
    }
    leer.close();
}}