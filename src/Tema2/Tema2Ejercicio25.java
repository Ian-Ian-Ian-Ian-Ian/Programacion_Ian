package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = in.nextInt();

        int fact = num - 1;
        if (fact < 0) {
            fact = -fact - 2;
        }

        while (fact > 0) {
            num = num * fact;
            fact--;
        }

        if (num == 0) {
           num = 1;
        }
        System.out.println("El factorial es " + num);
    }
}
