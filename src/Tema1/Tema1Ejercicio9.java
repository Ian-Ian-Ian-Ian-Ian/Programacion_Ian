package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un numero");
        int num1 = in.nextInt();

        System.out.println("Dame otro numero");
        int num2 = in.nextInt();

        int Suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + Suma);

        int Resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + Resta);

        int Producto = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + Producto);

        int Division = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + Division);

        int Resto = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + Resto);
    }
}
