/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java. */
package Practico.Intro;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una palabra o linea que inicia con A o a");
        String palabra = leer.nextLine();
        leer.close();
        if (palabra.toLowerCase().substring(0,1).equals("a")){
            System.out.println("La palabra o linea inicia con A");
        } else{
            System.out.println("No inicia con A");
            }
        
    }
    
}
