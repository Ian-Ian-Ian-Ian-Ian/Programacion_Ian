package Tema3;

import java.util.Scanner;

public class MyMath {
    public static int mathMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecciona lo que desea hacer");
        System.out.println("-----------------------------");
        System.out.println("1. Calcular perimetro");
        System.out.println("2. Calcular area");
        System.out.println("3. Comprobar si un número es primo");
        System.out.println("4. Contador de cifras");
        System.out.println("5. Contador cifras pares");
        System.out.println("6. Contador cifras impares");
        System.out.println("7. Factorial de un número");
        System.out.println("8. Factorial de un número (manera recursiva)");
        System.out.println("9. Ecuación");
        System.out.println("10.Suma de los dígitos");
        int opcion = in.nextInt();

        while (opcion < 1 || opcion > 10) {
            System.out.println("Selecciona una opción correcta");
            opcion = in.nextInt();
        }
        return opcion;
    }

    // -------------------------------------------------------------------------------------------------------
    public static double squarePerimeter(double lado) {
        return lado * 4;
    }

    public static double rectanglePerimeter(double base, double altura) {
        return (base * 2) + (altura * 2);
    }

    public static double circlePerimeter(double radio) {
        return 2 * radio * Math.PI;
    }

    public static double squareArea(double lado) {
        return lado * lado;
    }

    public static double rectangleArea(double base, double altura) {
        return base * altura;
    }

    public static double circleArea(double radio) {
        return Math.PI * (radio * radio);
    }
    // -------------------------------------------------------------------------------------------------------

    public static boolean primeNumber(int numero) {
        int divisores = 0;
        int dividendo = numero;
        int resultado = 0;
        boolean verdad = false;

        while (dividendo > 0) {
            resultado = numero % dividendo;
            if (resultado == 0) {
                divisores++;
            }
            dividendo--;
        }

        if (divisores == 1 || divisores == 2) {
            verdad = true;
        }
        return verdad;
    }

    public static boolean notPrimeNumber(int numero) {
        return !primeNumber(numero);
    }

    // -------------------------------------------------------------------------

    public static int digitNumber(int numero) {
        int cifra = 0;
        while (numero != 0) {
            numero = numero / 10;
            cifra++;
        }
        return cifra;
    }

    public static int evenDigits(int numero) {
        int par = 0;
        int cifra = 0;
        while (numero != 0) {
            cifra = numero % 2;
            if (cifra == 0) {
                par++;
            }
            numero = numero / 10;
        }
        return par;
    }

    public static int oddDigits(int numero) {
        int impar = 0;
        int cifra = 0;
        while (numero != 0) {
            cifra = numero % 2;
            if (cifra == 1) {
                impar++;
            }
            numero = numero / 10;
        }
        return impar;
    }

    public static int factorialNumber(int numero) {
        int total = numero;
        while (numero > 1) {
            numero--;
            total = total * numero;
        }
        return total;
    }

    public static int recursiveFactorialNumber(int numero) {
        while (numero > 1) {
            return numero * recursiveFactorialNumber(numero - 1);
        }
        return numero;
    }

    public static int equation(int a, int b, int c) {
        return (b * 2) - (4 * a * c);
    }

    public static int digitCount(int numero) {
        int total = 0;

        while (numero > 0) {
            total = total + (numero % 10);
            numero = numero / 10;
        }
        return total;
    }
}
