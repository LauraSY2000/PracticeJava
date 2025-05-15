package Practico.POO.Ejercicio7.Services;

import Practico.POO.Ejercicio7.Entidad.Persona;
import java.util.Scanner;

public class PersonaServices {
    Scanner read = new Scanner(System.in);

    public Persona crearPersona() {
        String sexo = "";
        Persona persona = new Persona();
        read.nextLine();
        System.out.println("Escriba el nombre de la persona");
        persona.setNombre(read.nextLine());
        System.out.println("Escriba la altura en metros. Por ejemplo: 1,65 ");
        persona.setAltura(read.nextFloat());
        while (!(sexo.equals("H") || sexo.equals("M") || sexo.equals("O"))) {
            System.out.println("Escriba el sexo. Puede ser H, M o O.");
            sexo = read.nextLine().toUpperCase();
        }
        System.out.println("Escriba la edad");
        persona.setEdad(read.nextInt());
        System.out.println("Escriba el peso en kg. Por ejemplo: 50");
        persona.setPeso(read.nextInt());
    
       
        persona.setSexo(sexo);
        return persona;
    }

    public int calcularIMC(Persona persona) {
        float IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        float intervaloIMC[] = new float[2];
        intervaloIMC[0] = 20 * (persona.getAltura() * persona.getAltura());
        intervaloIMC[1] = 25 * (persona.getAltura() * persona.getAltura());
        if (IMC < 20) {
            System.out.println("Estás por debajo de tu peso óptimo.\n Tu intervalo de peso ideal va de "
                    + intervaloIMC[0] + " kg hasta " + intervaloIMC[1] + " kg.");

            System.out.println();
            return -1;
        } else if (IMC <= 25) {
            System.out.println("Estas en tu peso óptimo");
            return 0;
        } else {
            System.out.println("Estás por encima de tu peso óptimo.\n Tu intervalo de peso ideal va de "
                    + intervaloIMC[0] + " kg hasta " + intervaloIMC[1] + " kg.");
            return 1;
        }
    }

    public boolean esMayorEdad(Persona persona) {
        if (persona.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }

    }

    public int numeroDePersonas() {
        System.out.println("Escribe el número de personas a registrar");
        return read.nextInt();
    }

    public void mostrarInformacion (Persona persona) {
        System.out.println("Los datos de la persona ingresada. ");
        System.out.println("Nombre " + persona.getNombre());
        System.out.println("Edad " + persona.getEdad() );
        System.out.println("Sexo " + persona.getSexo());
        System.out.println("Peso " + persona.getPeso());
        System.out.println("Altura " + persona.getAltura());

}
}