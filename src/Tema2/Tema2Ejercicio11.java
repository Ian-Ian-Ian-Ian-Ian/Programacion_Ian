package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = in.nextInt();

        System.out.println("Dame otro número");
        int num2 = in.nextInt();

        System.out.println("Dame un último número");
        int num3 = in.nextInt();

        if (num2 == num1 + 1 || num2 == num1 - 1){
            if (num3 == num2 + 1 || num3 == num2 - 1) {
                System.out.println("Los número son consecutivos");
            } else {
                System.out.println("Los número NO son consecutivos");
            }
        } else {
            System.out.println("Los número NO son consecutivos");
        }
    }
}
