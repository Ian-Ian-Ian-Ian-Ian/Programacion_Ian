package Tema6.Figuras;

public class Circulo extends Figura2D{

    @Override
    public double calcArea(double base, double altura, double area) {
        area=Math.PI * (base*base);
        return area;
    }

    @Override
    public double calcPerimetro(double base, double altura, double perimetro) {
        perimetro = Math.PI * 2 * base;
        return perimetro;
    }}
