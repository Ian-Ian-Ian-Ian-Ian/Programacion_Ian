package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("¿Cuál es la base del triángulo?");
        int Base = in.nextInt();

        System.out.println("¿Cuál es la altura del triángulo?");
        int Alt = in.nextInt();

        int Super = (Base * Alt) / 2 ;
        System.out.print("La superficie del triángulo es " + Super);
    }
}

