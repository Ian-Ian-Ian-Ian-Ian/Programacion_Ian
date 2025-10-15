package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {

        int Cara = 0;
        System.out.println("Dime un número de un dado de 6 caras");
        Scanner in = new Scanner(System.in);
        while (Cara < 1 || Cara > 6) {
            Cara = in.nextInt();
            if (Cara < 1 || Cara > 6) {
                System.out.println("Eso no es una cara del dado, Dame otro numero");
            }
        }
            int Contra = 7 - Cara;
            System.out.println("La cara contraria es " + Contra);
    }
}
