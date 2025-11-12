package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio2 {

    public static boolean isAdult(int edad){

        if (edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dime un número entero");
        int numero = in.nextInt();
        numero = Tema3Ejercicio1.numberSign(numero);

        switch (numero) {
            case -1:
                if (numero == -1) {
                    System.out.println("El número es negativo");
                }
            case 0:
                if (numero == 0) {
                    System.out.println("El número es 0");
                }
            case 1:
                if (numero == 1) {
                    System.out.println("El número es positivo");
                }
        }

        System.out.println();
        System.out.println("Dime tu edad");
        int edad = in.nextInt();
        if (edad < 0) {
            while (edad < 0) {
                System.out.println("Dame una edad real");
                edad = in.nextInt();
            }
        }
        boolean adulto = isAdult(edad);

        if (adulto){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}

