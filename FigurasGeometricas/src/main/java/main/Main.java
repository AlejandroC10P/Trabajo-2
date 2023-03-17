package main;
import Figuras.*;

public class Main {
    public static void main(String[] args) {
        
        Circulo circulo_1 = new Circulo(3);
        Rectangulo rectangulo_1 = new Rectangulo(5,8);
        Cuadrado cuadrado_1 = new Cuadrado(5);
        TrianguloRectangulo triangulo_1 = new TrianguloRectangulo(2,2);
        
        System.out.println("El area del circulo es: " + circulo_1.calcularArea());
        System.out.println("El perimetro del circulo es: " + circulo_1.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del rectangulo es: " + rectangulo_1.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo_1.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del cuadrado es: " + cuadrado_1.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + cuadrado_1.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del triangulo es: " + triangulo_1.calcularArea());
        System.out.println("El perimetro del triangulo es: " + triangulo_1.calcularPerimetro());
        triangulo_1.tipoTriangulo();
    }
}
