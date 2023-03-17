package Figuras;

public class Rectangulo extends Figura {

    //Atributos del rectangulo
    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Se sobreescriben los métodos heredados de la clase Padre "Figura"
    @Override
    public double calcularArea() {
        double area = getBase() * getAltura();
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (2 * getBase()) + (2 * getAltura());
        return perimetro;
    }
}
