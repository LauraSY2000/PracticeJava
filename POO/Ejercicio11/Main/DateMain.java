package Practico.POO.Ejercicio11.Main;
import Practico.POO.Ejercicio11.Entidad.Date;
import Practico.POO.Ejercicio11.Services.DateServices;

public class DateMain {
    
    public static void main(String[] args) {

        DateServices services = new DateServices();
        Date datePasada = services.registrarDate();
        Date datePresente = services.registrarDateActual();
        
        


    }
}
