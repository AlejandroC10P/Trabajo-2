package Figuras;

public class TrianguloRectangulo extends Figura {

    //Atributos del triangulo rectangulo
    private double base;
    private double altura;

    //Constructor
    public TrianguloRectangulo(double base, double altura) {
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

    //Metodo para calcular la hipotenusa
    public double calcularHipotenusa() {
        return Math.pow(getBase() * (getBase() + (getAltura() * getAltura())), 0.5);
    }

    //Se sobreescriben los métodos heredados de la clase Padre "Figura"
    @Override
    public double calcularArea() {
        double area = getBase() * (getAltura() / 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = getBase() + getAltura() + calcularHipotenusa();
        return perimetro;
    }

    //Determinar el tipo de triangulo (equilatero, escaleno o isosceles)
    public void tipoTriangulo() {
        if ((getBase() == getAltura()) && (getBase() == calcularHipotenusa()) && (getAltura() == calcularHipotenusa())) {
            System.out.println("Es un triangulo equilatero");
        } else if ((getBase() != getAltura()) && (getBase() != calcularHipotenusa()) && (getAltura() != calcularHipotenusa())) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isosceles");
        }
    }
}
