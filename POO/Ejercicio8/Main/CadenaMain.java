package Practico.POO.Ejercicio8.Main;

import Practico.POO.Ejercicio8.Services.CadenaServices;
import Practico.POO.Ejercicio8.Entidad.Cadena;

public class CadenaMain {

    public static void main(String[] args) {
        CadenaServices services = new CadenaServices();

        Cadena cadena1 = services.crearCadena();
        
        int numeroVocales = services.contarVocales(cadena1);
        System.out.println("'"+ cadena1.getFrase() + "'" + " tiene en total " + numeroVocales + " vocales");

        if (services.verificarContiene(cadena1)) {
            System.out.println("Sí contiene el caracter o frase");
        }else {
            System.out.println("No contiene el caracter o frase");
        }
        System.out.println(services.invertirFrase(cadena1));
        services.vecesRepetido(cadena1);
        services.unirFrase(cadena1);
        services.remplazar(cadena1);
        }
    
}
