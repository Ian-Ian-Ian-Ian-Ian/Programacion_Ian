package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("¿Cuál es la base del rectángulo?");
        int Base = in.nextInt();

        System.out.println("¿Cuál es la altura del rectángulo?");
        int Alt = in.nextInt();

        int Peri = (Base * 2) + (Alt * 2);
        System.out.println("El perímetro del rectángulo es " + Peri);

        int Super = Base * Alt ;
        System.out.print("La superficie del rectángulo es " + Super);
    }
}
