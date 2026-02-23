package Tema6.Figuras;

public class Rectangulo extends Figura2D{
    @Override
    public double calcArea(double base, double altura, double area) {
        area = base*altura;
        return area;
    }

    @Override
    public double calcPerimetro(double base, double altura, double perimetro) {
        perimetro=(base*2)+(altura*2);
        return perimetro;
    }
}
