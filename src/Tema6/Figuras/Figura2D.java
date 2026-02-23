package Tema6.Figuras;

abstract class Figura2D {
    protected double base;
    protected double altura;
    protected double area;
    protected double perimetro;

    abstract double calcArea(double base, double altura, double area);

    abstract double calcPerimetro(double base, double altura, double perimetro);

    public String toString() {
        return "";
    }
}
