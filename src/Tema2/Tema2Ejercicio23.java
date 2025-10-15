package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = 1;
        double media = 0;
        int total = 0;
        System.out.println("Ves insertando números y cuando quieras parar inserta un negativo");

        while (num1 > 0) {
            num1 = in.nextInt();
            if (num1 > 0) {
                media++;
                total = total + num1;
            }
        }
        media = total / media;
        System.out.println("La media de total es de " + media);
    }
}
