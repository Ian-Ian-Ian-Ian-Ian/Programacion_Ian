package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dime los euriños");
        int euro = in.nextInt();

        double dolar = euro * 1.17;
        System.out.println("Tienes " + dolar + " dolares");
    }
}
