package Practico.POO.Ejercicio5.Main;
import Practico.POO.Ejercicio5.Entidad.Cuenta;
import Practico.POO.Ejercicio5.Services.CuentaServices;
public class CuentaMain {
    public static void main(String[] args) {
        CuentaServices service = new CuentaServices();
        Cuenta cuenta1 = service.crearCuenta();
        service.consultarSaldo(cuenta1);
        service.sumarSaldo(cuenta1);
        service.consultarSaldo(cuenta1);
        service.restarSaldo(cuenta1);
        service.consultarSaldo(cuenta1);
        service.consultarDatos(cuenta1);
        service.retiroVeintePorciento(cuenta1);
        service.consultarSaldo(cuenta1);
        
    }
}
