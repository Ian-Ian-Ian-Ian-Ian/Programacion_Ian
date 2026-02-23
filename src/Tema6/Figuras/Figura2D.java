package Tema6.Figuras;

abstract class Figura2D {
    protected double base;
    protected double altura;
    protected double area;
    protected double perimetro;

    public abstract double calcArea(double base, double altura, double area);

    public abstract double calcPerimetro(double base, double altura, double perimetro);

    public String toString() {
        return "El perímetro de la figura es: " + perimetro +
                "Y el área de la figura es: " + area;
    }
}
