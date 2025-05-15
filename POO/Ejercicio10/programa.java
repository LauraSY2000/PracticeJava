package Practico.POO.Ejercicio10;

import java.util.Random;

public class programa {
    public static void main(String[] args) {
        float[] arregloA = crearArreglo(40);
        llenarArreglo(arregloA, true);
        ordenarArreglo(arregloA);
        llenarArreglo(arregloA, false);





    }

    public static float[] crearArreglo(int x) {
        float[] arreglo = new float[x];
        return arreglo;
    }

    public static void llenarArreglo(float[] arreglo, boolean tipo) {
        Random random = new Random();
        if (tipo == true ){
            System.out.println("El arreglo A está compuesto por los elementos");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextFloat(0, 10);
            System.out.println(arreglo[i]);
        }} else {
            System.out.println("El arreglo B está compuesto por los elementos");

            float [] arregloB = new float [20];
            arreglo = ordenarArreglo(arreglo);
            for (int i = 0; i < 10; i++) {
                arregloB [i] = arreglo [i];
                System.out.println(arregloB [i]);
            }
            for (int i = 10; i < arregloB.length; i++) {
                arregloB [i] = 5;
                System.out.println(arregloB [i]);
            }
        }
    }

    public static float [] ordenarArreglo(float[] arreglo) {

        int posicion = 0;
        boolean[] usado = new boolean[arreglo.length];
        float[] arregloOrdenado = new float[arreglo.length];
        for (int i = 0; i < arregloOrdenado.length; i++) {
            float numeroMayor = Float.NEGATIVE_INFINITY;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] > numeroMayor && usado[j] != true) {
                    numeroMayor = arreglo[j];
                    posicion = j;
                }
            }
            usado[posicion] = true;
            arregloOrdenado[i] = numeroMayor;
            }
        return arregloOrdenado;

    }
}