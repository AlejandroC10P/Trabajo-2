package Figuras;

public class Circulo extends Figura {

    //Atributos del circulo
    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Se sobreescriben los métodos heredados de la clase Padre "Figura"
    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(getRadio(), 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * getRadio();
        return perimetro;

    }

}
