package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = in.nextInt();

        int divisor = num ;
        int resto = 0;
        int total = 0;


        for (divisor = num; divisor > 0; divisor--) {
            resto = num % divisor;
            if (resto == 0) {
                total++;
            }
        }

        boolean primo = total <= 2;

        if (primo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número NO es primo");
        }
    }
}
