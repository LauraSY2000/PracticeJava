package Practico.POO.Ejercicio5.Entidad;

public class Cuenta {
    private int numeroCuenta;
    private int IdCliente;
    private double saldoActual;

//Constructores

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int idCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        IdCliente = idCliente;
        this.saldoActual = saldoActual;
    }
//Getter and setters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}

