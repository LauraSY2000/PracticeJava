package Practico.POO.Ejercicio5.Services;

import Practico.POO.Ejercicio5.Entidad.Cuenta;
import java.util.Scanner;

public class CuentaServices {
    Scanner read = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("Escriba el número de cuenta");
        cuenta.setNumeroCuenta(read.nextInt());
        System.out.println("Escriba el ID del cliente");
        cuenta.setIdCliente(read.nextInt());
        System.out.println("Escriba el saldo de la cuenta");
        cuenta.setSaldoActual(read.nextInt());
        return cuenta;
    }

    public Cuenta sumarSaldo(Cuenta cuenta) {
        System.out.println("Escriba la cantidad de dinero a sumar al saldo actual");
        cuenta.setSaldoActual((cuenta.getSaldoActual() + read.nextDouble()));
        return cuenta;
    }

    public Cuenta restarSaldo(Cuenta cuenta) {
        System.out.println("Escriba la cantidad de dinero a retirar del saldo actual");

        return cuenta;
    }

    public Cuenta retiroVeintePorciento(Cuenta cuenta) {
        System.out.println(
                "Escriba la cantidad de dinero que desea retirar. Recuerde que no debe sobrepasar el 20% de su saldo");
        double retiro = read.nextDouble();
        if (retiro <= cuenta.getSaldoActual() * 0.2) {
            cuenta.setSaldoActual((cuenta.getSaldoActual() - retiro));
        } else {
            System.out.println("El monto supera el 20% del saldo actual.");
        }
        return cuenta;
    }
    public void consultarSaldo (Cuenta cuenta){
        System.out.println("Su saldo actual es " + cuenta.getSaldoActual());
    }

    public void consultarDatos (Cuenta cuenta){
        System.out.println("Su ID es " + cuenta.getIdCliente());
        System.out.println("Su número de cuenta es " + cuenta.getNumeroCuenta());
    }

}
