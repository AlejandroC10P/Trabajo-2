package Figuras;

public abstract class Figura {

    //Atributos en todas las figuras
    protected double area;
    protected double perimetro;

    //Métodos get
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }

    //Metodos abstractos
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

