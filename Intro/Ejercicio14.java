/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
 estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a converir
  que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */

package Practico.Intro;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la cantidad de auros y la moneda a transformar siendo A. Dólares, B. Yenes y C. Libras");
        int valor = leer.nextInt();
        leer.nextLine();
        String divisa = leer.nextLine();
        leer.close();
        double conversion = convertir(valor, divisa);
        System.out.println("El valor de la moneda en el cambio elegido es " + conversion);
        
    }

    public static double convertir (int valor, String divisa){
        double cambio = 0;
        switch (divisa) {
            case "A":
            cambio = valor * 1.28611;
                break;
            case "B":
            cambio = valor * 129.852;
                break;
            case "C":
            cambio = valor*  0.86;
            default:
            System.out.println("Error en el comando de divisa");
                break;
        }

        return cambio;
       }
    
}
