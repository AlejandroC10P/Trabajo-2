package Figuras;

public class Cuadrado extends Figura {

    //Atributos del rectangulo
    private double lado;

    //Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //getters y setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Se sobreescriben los métodos heredados de la clase Padre "Figura"
    @Override
    public double calcularArea() {
        double area = getLado() * getLado();
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = getLado() * 4;
        return perimetro;
    }

}
