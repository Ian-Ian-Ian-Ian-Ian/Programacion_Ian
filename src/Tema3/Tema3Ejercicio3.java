package Tema3;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static boolean validRadius(double radio){
        if (radio <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static double calculateCirclePerimeter(double perimetro){
        perimetro = perimetro * 3.14 * 2;
        return perimetro;
    }

    public static double calculateCircleArea(double area){
        area = (area * area) * 3.14;
        return area;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un radio válido");
        double radio = in.nextInt();

        boolean valido = validRadius(radio);


        if (!valido){
            while (!valido) {
                System.out.println("Eso no es un radio válido, vuelve a introducirlo ");
                radio = in.nextInt();
                valido = validRadius(radio);
            }
        }

        double perimetro = calculateCirclePerimeter(radio);
        double area = calculateCircleArea(radio);

        System.out.println("El perímetro es: " + perimetro);
        System.out.println("El área es: " + area);
    }
}
