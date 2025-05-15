package Practico.POO.Ejercicio9.Services;
import Practico.POO.Ejercicio9.Entidad.Matematica;
import java.util.Random;

public class MatematicaServices {
    Random random = new Random();

    public Matematica crearMatematica (){
        Matematica operacion = new Matematica();

        operacion.setNumero1(random.nextFloat(0,100));
        operacion.setNumero2(random.nextFloat(0,100));
        System.out.println("El operador 1 es " + operacion.getNumero1() + " y el operador 2 es " + operacion.getNumero2());
        return operacion;
    }

    public void numeroMayor (Matematica matematica) {


        if (matematica.getNumero1() == matematica.getNumero2()) {
            System.out.println("Los números son iguales");
        } else if (matematica.getNumero1() > matematica.getNumero2()) {
            System.out.println("El número mayor es " + matematica.getNumero1());
        } else {
            System.out.println("El número mayor es " + matematica.getNumero2());
        }
    }

    public void calcularPotencia(Matematica matematica){
        int numero1 = (int) (matematica.getNumero1());
        int numero2 = (int) (matematica.getNumero2());
        double resultado = 0;
        if (numero1 > numero2){
            resultado= Math.pow(numero1, numero2);
        } else {
            resultado= Math.pow(numero2, numero1);
        }
        System.out.println("El resultado de la potencia es " + resultado);
    }

    public void calcularRaiz(Matematica matematica){
        int numero1 = Math.abs((int) (matematica.getNumero1()));
        int numero2 = Math.abs((int) (matematica.getNumero2()));
        System.out.println("La raiz del operador 1 absoluto" + numero1 + " es "  +Math.sqrt(numero1));
        System.out.println("La raiz del operador 2 absoluto" + numero2 + " es "  +Math.sqrt(numero2));
    }
       
}
