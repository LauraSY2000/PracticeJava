package Practico.POO.Ejercicio3.Main;
import Practico.POO.Ejercicio3.Entidad.Operacion;
import Practico.POO.Ejercicio3.Services.OperacionServices;

public class OperacionMain {

    public static void main(String[] args) {
        Operacion a = new Operacion();
        OperacionServices service = new OperacionServices();
        service.crearOperacion(a);
        System.out.println("la suma es: " + OperacionServices.suma(a));
        System.out.println("la resta es: " + OperacionServices.resta(a));
        System.out.println("la multiplicación es: " + OperacionServices.multiplicacion(a));
        System.out.println("la división es: " + OperacionServices.division(a));



    }
    
}
