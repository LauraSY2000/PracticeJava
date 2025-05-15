/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
 el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(). */

 package Practico.Intro; 
import java.util.Scanner; 
 public class Ejercicio5{
    public static void main (String [] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Hola. Escribe un número entero para mostrar su doble, triple y raiz cuadrada");
        int numero = leer.nextInt(); 

        System.out.println("El doble de " + numero + " es " + (numero*2) + ", el triple es " + (numero*3) + " y la raiz cuadrada es " + Math.sqrt(numero));

        leer.close();
    }
 }