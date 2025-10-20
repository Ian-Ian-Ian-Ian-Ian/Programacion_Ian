package Tema2;

import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String confirmacion = "si";
        boolean continuar = true;
        int total = 0;

        while (continuar) {

            System.out.println("Dame un número");
            int num1 = in.nextInt();

            System.out.println("Dime la operación ( + | - | * | / | % )");
            String operacion = in.next();

            System.out.println("Dame otro número");
            int num2 = in.nextInt();

            switch (operacion) {
                case "+":
                    total = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + total);
                    break;
                case "-":
                    total = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + total);
                    break;
                case "*":
                    total = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + total);
                    break;
                case "/":
                    total = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + total);
                    break;
                case "%":
                    total = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + total);
                    break;
                default:
                    System.out.println("Has introducido una operación invalida");
                    break;
            }
            System.out.println("¿Quieres continuar haciendo operaciones?");
            confirmacion = in.next();

            continuar = confirmacion.equals("si");
        }
    }
}
