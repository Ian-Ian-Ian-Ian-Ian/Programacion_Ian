package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = in.nextInt();

        System.out.println("Dame otro número");
        int num2 = in.nextInt();

        System.out.println("Dame un último número");
        int num3 = in.nextInt();

        if (num1 < num2){
            if (num2 < num3) {
                System.out.println("Los número estan ordenados de menor a mayor");
            } else {
                System.out.println("Los número NO estan ordenados de menor a mayor");
            }
        } else {
            System.out.println("Los número NO estan ordenados de menor a mayor");
        }
    }
}
