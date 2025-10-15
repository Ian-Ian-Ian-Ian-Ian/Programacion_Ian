package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dime el número de la figura que quieres (0 = cuadrado | 1 = rectángulo | 2 = triángulo )");
         int figura = in.nextInt();

        System.out.println("Dime la base");
        int base = in.nextInt();

        System.out.println("Dime la altura");
        int alt = in.nextInt();

        double Supr = 0;
        double Peri = 0;

        switch (figura) {
            case 0:
                if (figura == 0) {
                    if (alt == base) {
                        Supr = alt * alt;
                        Peri = alt * 4;
                        System.out.println("La superficie del cuadrado es " + Supr + " y el perimetro " + Peri);
                    } else {
                        System.out.println("La base y la altura necesitan ser las mismas");
                    }
                }
            case 1:
                if (figura == 1) {
                    Supr = base * alt;
                    Peri = (base * 2) + (alt * 2);
                    System.out.println("La superficie del retángulo es " + Supr + " y el perimetro " + Peri);
                }
            case 2:
                if (figura == 2) {
                    Supr = (alt * base) / 2;
                    System.out.println("La superficie del triángulo es " + Supr);
                }
            default:
                if (figura != 0 && figura != 1 && figura != 2) {
                    System.out.println("ERROR: esa no es una de las opciones");
                }
        }
    }
}
