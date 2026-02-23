package Tema6.Figuras;

public class Cuadrado extends Figura2D{
    @Override
    public double calcArea(double base, double altura, double area) {
        area=base*base;
        return area;
    }

    @Override
    public double calcPerimetro(double base, double altura, double perimetro) {
        perimetro = base*4;
        return perimetro;
    }
}
