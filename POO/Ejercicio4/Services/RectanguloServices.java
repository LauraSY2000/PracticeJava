package Practico.POO.Ejercicio4.Services;
import Practico.POO.Ejercicio4.Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloServices {
    
    public Rectangulo crearRectangulo (){
        Scanner read = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        System.out.println("Escriba la altura del rectangulo");
        r.setAltura(read.nextInt());
        System.out.println("Escriba la base del rectangulo");
        r.setBase(read.nextInt());
        return r;
    }
    public static int perimetroRectangulo(Rectangulo r) {
        return (r.getAltura()+r.getBase())*2;
    }
    public static int areaRectangulo(Rectangulo r) {
        return (r.getAltura()*r.getBase());
    }

    public static void dibujarRectangulo(Rectangulo r){
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
