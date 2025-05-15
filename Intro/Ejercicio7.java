/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá 
un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java. */
package Practico.Intro; 
import java.util.Scanner; 

public class Ejercicio7{

    public static void main (String [] args){
        Scanner leer = new Scanner (System.in);

        System.out.println("Escriba la contraseña.");
        String contraseña = leer.nextLine(); 

        if (contraseña.toLowerCase().equals("eureka") ){
            System.out.println ("Contraseña correcta"); 
            } else {
                System.out.println("Contraseña incorrecta");
            }
            leer.close();
               }
    }