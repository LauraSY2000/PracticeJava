//*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.*/
package Practico.Intro;

public class Ejercicio15 {
    public static void main(String[] args) {


        System.out.println(llenarVector());
        
    }
    public static int [] llenarVector() {

        int [] vector = new int [100];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = i; 
            System.out.println(vector[i]);
        }

        return vector;

    }
    
}
