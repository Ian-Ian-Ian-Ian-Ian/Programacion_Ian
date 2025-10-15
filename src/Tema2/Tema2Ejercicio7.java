package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = in.nextInt();

        System.out.println("Dame otro número");
        int num2 = in.nextInt();

        if (num1 >= num2) {
            int Resul = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + Resul);
        } else {
            int Resul = num2 - num1;
            System.out.println(num2 + " - " + num1 + " = " + Resul);
        }
    }
}
