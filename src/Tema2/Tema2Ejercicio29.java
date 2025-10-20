package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {

        Random random = new Random();
        int secreto = random.nextInt(100);
        Scanner in = new Scanner(System.in);

        System.out.println("Intenta adivinar el número del 1 al 100");
        int num = 0;
        int bucle = 1;

        while (bucle > 0) {
            num = in.nextInt();
            if (num > secreto) {
                System.out.println("El número es más pequeño que el tuyo");
            } else if (num < secreto) {
                System.out.println("El número es más grande que el tuyo");
            } else if (num == secreto) {
                System.out.println("¡Has acertado!");
                bucle = 0;
            }
        }
    }
}
