/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
package Practico.Intro; 

import java.util.Scanner;

public class Ejercicio3{

    public static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println ("Escriba una frase para mostrarla en mayúsculas y en minúsculas");
        String frase = leer.nextLine(); 
        System.out.println (frase.toUpperCase());
        System.out.println (frase.toLowerCase()); 
        leer.close();



}
}