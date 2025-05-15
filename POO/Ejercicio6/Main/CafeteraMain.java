package Practico.POO.Ejercicio6.Main;
import Practico.POO.Ejercicio6.Entidad.Cafetera;
import Practico.POO.Ejercicio6.Services.CafeteraServices;

public class CafeteraMain {

    public static void main(String[] args) {
        CafeteraServices services = new CafeteraServices();
        Cafetera c1 = services.crearCafetera();

        services.llenarCafetera(c1);
        int taza = 10; 
        services.servirTaza(0, c1);
        services.vaciarCafetera(c1);
        services.servirTaza(taza, c1);
        services.llenarCafetera(c1);
        
    }
    
}
