package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = in.nextInt();
        double num11 = num1;

        System.out.println("Dame otro número");
        int num2 = in.nextInt();
        double num22 = num2;

        System.out.println("Dame un último número");
        int num3 = in.nextInt();
        double num33 = num3;

        int MediaNormal = (num1 + num2 + num3) / 3;
        System.out.println("La media sin decimales es " + MediaNormal);

        double MediaDecimal = (num11 + num22 + num33) / 3;
        System.out.println("La media con decimales es " + MediaDecimal);
    }
}
