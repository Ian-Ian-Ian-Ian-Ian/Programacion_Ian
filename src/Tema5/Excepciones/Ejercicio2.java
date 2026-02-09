package Tema5.Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        boolean continuar = true;
        double result = 0;

        try {
            System.out.println("Introduce el primer número: ");
            num1 = in.nextInt();
            System.out.println("Introduce el segundo número: ");
            num2 = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("No se ha introducido un valor correcto, finalizando programa");
            continuar = false;
        }


        if (continuar) {
            try {
                result = num1 / num2;
                System.out.println("El resultado de la división " + num1 + "/" + num2 + " es: " + result);
            } catch (ArithmeticException ex) {
                System.out.println("No se puede realizar la división");
            }
        }
    }
}
