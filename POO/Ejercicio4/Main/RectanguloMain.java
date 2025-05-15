package Practico.POO.Ejercicio4.Main;
import Practico.POO.Ejercicio4.Entidad.Rectangulo;
import Practico.POO.Ejercicio4.Services.RectanguloServices;
public class RectanguloMain {
    public static void main(String[] args) {
        RectanguloServices services = new RectanguloServices();
        Rectangulo rectangulo1 = services.crearRectangulo();
        System.out.println("El perimetro del rectangulo es " + RectanguloServices.perimetroRectangulo(rectangulo1));
        System.out.println("El área del rectangulo es " + RectanguloServices.areaRectangulo(rectangulo1));
        System.out.println("Esta es su representación: ");
        RectanguloServices.dibujarRectangulo(rectangulo1);

    }
}
