package Practico.POO.Ejercicio11.Services;

import Practico.POO.Ejercicio11.Entidad.Date;
import java.util.Scanner;

public class DateServices {

    Scanner read = new Scanner(System.in);

    public Date registrarDate() {

        Date date = new Date();

        System.out.println("Escriba el día de la fecha a registrar. Solo valores de 1 a 31");
        date.setDia(read.nextInt());
        System.out.println("Escriba el mes de la fecha a registrar. Solo valores de 1 a 12");
        date.setMes(read.nextInt());
        System.out.println("Escriba el año de la fecha a registrar");
        date.setAño(read.nextInt());

        return date;
    }

    public Date registrarDateActual (){
        Date date = new Date();
        return date;
    }

    public void compararDate(Date date1, Date date2) {
        int dia1 = date1.getDia();
        int mes1 = date1.getMes();
        int anio1 = date1.getAño();
    
        int dia2 = date2.getDia();
        int mes2 = date2.getMes();
        int anio2 = date2.getAño();
    
        // Asegurarnos de que date1 sea la fecha más reciente
        if ((anio1 < anio2) || (anio1 == anio2 && mes1 < mes2) || (anio1 == anio2 && mes1 == mes2 && dia1 < dia2)) {
            // Intercambiar fechas
            int tempDia = dia1, tempMes = mes1, tempAnio = anio1;
            dia1 = dia2; mes1 = mes2; anio1 = anio2;
            dia2 = tempDia; mes2 = tempMes; anio2 = tempAnio;
        }
    
        int diferenciaDias = dia1 - dia2;
        int diferenciaMeses = mes1 - mes2;
        int diferenciaAnios = anio1 - anio2;
    
        // Ajuste si los días no alcanzan
        if (diferenciaDias < 0) {
            diferenciaDias += 30; // simplificación
            diferenciaMeses--;
        }
    
        // Ajuste si los meses no alcanzan
        if (diferenciaMeses < 0) {
            diferenciaMeses += 12;
            diferenciaAnios--;
        }
    
        System.out.println("Diferencia: " + diferenciaAnios + " años, " + diferenciaMeses + " meses, " + diferenciaDias + " días.");
    }


    public void mostrarDate(Date date) {
        System.out.println("La fecha registrada es: ");
        System.out.println(date.getDia()+ "/" + date.getMes() + "/" + date.getAño());
    }


}
