/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
 en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
 ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
  caso contrario se vuelve a mostrar el menú. */
package Practico.Intro;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba dos numeros enteros positivos");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        boolean salida = false;
        while (salida == false) {
            System.out.println("Elija la operación que desea desarrollar\r\n" + //
                        "1. Sumar\r\n" + //
                        "2. Restar\r\n" + //
                        "3. Multiplicar\r\n" + //
                        "4. Dividir\r\n" + //
                        "5. Salir");
            int opcion = leer.nextInt();  
            leer.nextLine();
        
            switch (opcion) {
                case 1:
                    System.out.println(numero1+numero2);
                    break;
                case 2:
                    System.out.println(numero1-numero2);
                    break;
                case 3:
                    System.out.println(numero1*numero2);
                    break;
                case 4:
                    System.out.println(numero1/numero2);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String respuestaSalida = leer.nextLine();
                    if (respuestaSalida.toLowerCase().equals("s")) {
                        salida = true;
                    }
                    break; 
                default:
                    System.out.println("Opción no válida. Vuelva a intentarlo.");
                    break;
        }
    }
    System.out.println("Fin del programa");
leer.close();}
}
