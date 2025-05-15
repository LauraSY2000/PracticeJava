package Practico.POO.Ejercicio9.Main;
import Practico.POO.Ejercicio9.Entidad.Matematica;
import Practico.POO.Ejercicio9.Services.MatematicaServices;

public class MatematicaMain {
    public static void main(String[] args) {
        MatematicaServices services = new MatematicaServices();
        Matematica operacion1 = services.crearMatematica();
        services.numeroMayor(operacion1);
        services.calcularPotencia(operacion1);
        services.calcularRaiz(operacion1);
    }
    
}
