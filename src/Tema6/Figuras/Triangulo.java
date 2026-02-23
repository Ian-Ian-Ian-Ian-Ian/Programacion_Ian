package Tema6.Figuras;

public class Triangulo extends Figura2D{
    @Override
    public double calcArea(double base, double altura, double area) {
        area=(base*altura) / 2;
        return area;
    }

    @Override
    public double calcPerimetro(double base, double altura, double perimetro){
        perimetro = base*3;
        return perimetro;
    }
}
