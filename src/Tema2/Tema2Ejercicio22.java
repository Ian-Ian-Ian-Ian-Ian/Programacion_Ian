package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un número");
        int num1 = in.nextInt();
        int cif = 0;

        if (num1 < 0) {
            num1 = -num1;
        }

        while (0 < num1){
            num1 = num1 / 10;
            cif++;
        }

        if (cif == 1) {
            System.out.println("El número tiene " + cif + " cifra");
        } else if (cif > 1) {
            System.out.println("El número tiene " + cif + " cifras");
        } else {
            System.out.println("El número no es entero");
        }
    }
}


