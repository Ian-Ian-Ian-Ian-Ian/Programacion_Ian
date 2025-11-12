package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio1 {

    public static int numberSign(int resultado){

        if (resultado > 0) {
            return 1;
        } else if (resultado < 0){
            return -1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Dime un número entero");
        int numero = in.nextInt();
        numero = numberSign(numero);

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
    }
}
