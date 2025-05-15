package Practico.POO.Ejercicio3.Services;
import Practico.POO.Ejercicio3.Entidad.Operacion;
import java.util.Scanner;

public class OperacionServices {
    public Operacion crearOperacion(Operacion x) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el primer número de la operación");
        x.setNumero1(leer.nextInt());
        System.out.println("Escriba el segundo número de la operación");
        x.setNumero2(leer.nextInt());
        return x; 
    }
    public static int suma (Operacion x) {
        return x.getNumero1() + x.getNumero2();
    }

    public static int resta (Operacion x) {
        return x.getNumero1() - x.getNumero2();
    }

    public static int multiplicacion (Operacion x) {
        return x.getNumero1() * x.getNumero2();
    }

    public static int division (Operacion x) {
        return x.getNumero1() / x.getNumero2();
    }
}
