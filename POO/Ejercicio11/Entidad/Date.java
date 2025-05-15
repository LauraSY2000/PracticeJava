package Practico.POO.Ejercicio11.Entidad;

import java.time.LocalDate;

public class Date {
    private int año;
    private int mes; 
    private int dia;


    
    public Date() {
        LocalDate.now();
    }

    public Date(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if (mes>= 1 && mes >=12){
        this.mes = mes;} else {
            System.out.println("Valos no válido. Solo números enteros de 1 a 12");
        }
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if (dia>=1 && dia<=31){
        this.dia = dia;} else {
            System.out.println("Valor no válido. Solo es posible poner un día que vaya de 1 a 31");
        }  }
}


