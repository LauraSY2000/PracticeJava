package Practico.POO.Ejercicio7.Main;
import Practico.POO.Ejercicio7.Entidad.Persona;
import Practico.POO.Ejercicio7.Services.PersonaServices;

public class PersonaMain {
    public static void main(String[] args) {
        PersonaServices services = new PersonaServices();
        int n = services.numeroDePersonas();
        for (int i = 0; i < n; i++) {
            Persona persona = services.crearPersona();
            services.mostrarInformacion(persona);
            if (services.esMayorEdad(persona) == true) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }
        services.calcularIMC(persona);
        }

    }
    
}
