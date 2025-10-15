package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("¿Cuál es el lado del cuadrado?");
        int Lado = in.nextInt();

        int Peri = Lado * 4;
        System.out.println("El perímetro del cuadrado es " + Peri);

        int Super = Lado * Lado;
        System.out.print("La superficie del cuadrado es " + Super);
    }
}
