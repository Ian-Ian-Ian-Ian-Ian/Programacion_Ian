package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número cualquiera ");
        int num1 = in.nextInt();

        if (num1 > 0){
            System.out.println("El número es positivo");
        } else if (num1 < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

    }
}
