package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main(String[] args) {

        System.out.println("Dame el radio");
        Scanner in = new Scanner(System.in);
        float R = in.nextFloat();
        double A = 3.14 * R * R;
        System.out.println("El área es " + A);

    }
}