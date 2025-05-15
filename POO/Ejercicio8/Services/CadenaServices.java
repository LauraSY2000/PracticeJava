package Practico.POO.Ejercicio8.Services;

import Practico.POO.Ejercicio8.Entidad.Cadena;
import java.util.Scanner;

public class CadenaServices {
    Scanner read = new Scanner(System.in);

    public Cadena crearCadena() {
        Cadena cadena = new Cadena();
        System.out.println("Escribe la cadena");
        cadena.setFrase(read.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }

    public int contarVocales(Cadena cadena) {

        String vocales = "aeiou";
        int j = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (cadena.getFrase().charAt(i) == vocales.charAt(0) || cadena.getFrase().charAt(i) == vocales.charAt(1)
                    || cadena.getFrase().charAt(i) == vocales.charAt(2)
                    || cadena.getFrase().charAt(i) == vocales.charAt(3)
                    || cadena.getFrase().charAt(i) == vocales.charAt(4)) {
                j++;
            }
        }

        return j;
    }

    public String invertirFrase(Cadena cadena) {
        String fraseInvertida = "";
        for (int i = (cadena.getLongitud() - 1); i >= 0; i--) {
            fraseInvertida += cadena.getFrase().charAt(i);
        }
        return fraseInvertida;
    }

    public void vecesRepetido(Cadena cadena) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el caracter a buscar. Recuerda que es un caracter único");
        String caracter = read.nextLine();
        int j = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == caracter.charAt(0)) {
                System.out.println("El caracter " + caracter + " está ubicado en " + i);
                j++;
            }
        }
        System.out.println("El caracter se repetio " + j + " veces.");
    }

    public void unirFrase(Cadena cadena) {
        Scanner read = new Scanner(System.in);
        System.out.println("Escriba la frase que desea unir a la cadena de texto creada originalmente");
        String fraseParaUnir = read.nextLine();
        cadena.setFrase(cadena.getFrase() + " " + fraseParaUnir);
        System.out.println("La cadena ahora es " + cadena.getFrase());
    }

    public void remplazar(Cadena cadena) {
        Scanner read = new Scanner(System.in);
        System.out.println("Escriba el caracter que quiere reemplazar por la 'a' de toda la cadena de caracteres");
        String caracterNuevo = read.nextLine();

        if (caracterNuevo.length() != 1) {
            System.out.println("Por favor, ingrese solo un carácter.");
            return;
        }

        String fraseVariable = cadena.getFrase(); // Obtenemos la frase original
        StringBuilder nuevaFrase = new StringBuilder(); // Usamos StringBuilder para construir la nueva frase

        for (int i = 0; i < fraseVariable.length(); i++) {
            if (fraseVariable.charAt(i) == 'a') {
                nuevaFrase.append(caracterNuevo); // Reemplazamos 'a' por el nuevo carácter
            } else {
                nuevaFrase.append(fraseVariable.charAt(i)); // Mantenemos el carácter original
            }
        }

        System.out.println("Frase modificada: " + nuevaFrase.toString());
    }

    public boolean verificarContiene(Cadena cadena) {
        Scanner read = new Scanner(System.in);
        System.out.println("Escriba el caracter o frase quiere buscar");
        String fraseBuscar = read.nextLine();
        return cadena.getFrase().contains(fraseBuscar);
    }
}