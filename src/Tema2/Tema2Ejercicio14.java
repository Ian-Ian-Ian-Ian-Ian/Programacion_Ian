package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("¿Cuántas personas?");
        int pers = in.nextInt();

        System.out.println("¿Cuántos días?");
        int dias = in.nextInt();

        if (pers > 5 && dias >= 7 ) {
            double desc = (pers * 15 * dias) * 25 / 100;
            double total = (pers * 15 * dias) - desc;
            System.out.println("El total a pagar es de " + total);
        } else {
            double total = (pers * 15 * dias);
            System.out.println("El total a pagar es de " + total);
        }
    }
}
