package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número");
        int numA = in.nextInt();

        System.out.println("Dame otro número");
        int numB = in.nextInt();

        if (numB > numA) {
            while (numA <= numB){
                if (numA%2 == 1) {
                    System.out.println(numA);
                }
                numA++;
            }
        }
    }
}
