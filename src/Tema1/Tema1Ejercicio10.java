package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dame un numero");
        float num1 = in.nextFloat();

        System.out.println("Dame otro numero");
        float num2 = in.nextFloat();

        double Suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + Suma);

        double Resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + Resta);

        double Producto = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + Producto);

        double Division = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + Division);
    }
}
