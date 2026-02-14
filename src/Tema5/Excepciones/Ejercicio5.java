package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void showMenu() {
        System.out.println("Selecciona la opción que quieras realizar");
        System.out.println("-----------------------------------------");
        System.out.println("1. Introducir valor positivo e imprimirlo");
        System.out.println("2. Introducir valor negativo e imprimirlo");
        System.out.println("3. Salir");
    }

    /*Nota a futuro
    Por alguna extraña razón, solo Dios y el que ha creado el programa lo sabrá,
    si pones el print que salga como err, el mensaje de error sale tarde,
    mientras que si lo pones con out sale bien.
     */
    public static void imprimePositivo(int p) {
        if (p < 0) {
            System.err.println("Se ha introducido un valor negativo, no se printeará el número");
        } else {
            System.out.println(p);
        }
    }

    public static void imprimeNegativo(int n) {
        if (n >= 0) {
            System.err.println("Se ha introfucido un valor positivo, no se printeará el número");
        } else {
            System.out.println(n);
        }
    }

    public static int exceptionChecker() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el valor: ");
        int valor = 0;
        boolean valido = false;

        while (!valido) {
            try {
                valor = in.nextInt();
                valido = true;
            } catch (InputMismatchException ex) {
                System.err.println("Se ha introducido un valor erróneo");
                in.next();
                System.out.print("por favor introduzca un valor correcto: ");
            }
        }

        return valor;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor = 0;
        int opcion = 0;
        boolean bucle = true;

        while (bucle) {
            showMenu();
            while (bucle) {
                try {
                    opcion = in.nextInt();
                    while (opcion < 1 || opcion > 3) {
                        System.out.println("Seleccione una opción válida");
                        opcion = in.nextInt();
                    }
                    bucle = false;
                } catch (InputMismatchException ex) {
                    System.err.println("Se ha introducido un valor erróneo");
                    System.out.println("Por favor, seleccione una opción válida");
                    in.next();
                }
            }
            bucle = true;

            switch (opcion) {
                case 1:
                    valor = exceptionChecker();
                    imprimePositivo(valor);
                    break;
                case 2:
                    valor = exceptionChecker();
                    imprimeNegativo(valor);
                    break;
                case 3:
                    bucle = false;
                    break;
            }
        }
    }
}
