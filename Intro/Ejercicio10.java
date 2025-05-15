/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 números al usuario hasta que la suma de los números introducidos supere el límite inicial. */
package Practico.Intro;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escriba un límite positivo entero");
        int limite = leer.nextInt();
        int suma = 0;
        while (suma<=limite) {
            System.out.println("Escriba un numero a sumar");
            int numero = leer.nextInt();
            System.out.println(suma + " + " + numero );          
            suma+=numero;   
            System.out.println("= " + suma);
            leer.close();
        }
        System.out.println("La suma es igual a " + suma + " y supera al limite por " + (suma-limite));

    }
    
}
