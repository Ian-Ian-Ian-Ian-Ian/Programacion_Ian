package Tema3;

import java.util.Scanner;

import static Tema3.MyMath.*;

public class Ejercicio10Modulos2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double perimetro = 0;
        double area = 0;
        double base = 0;
        double altura = 0;
        double resul = 0;
        int resulint = 0;

        int opcion = mathMenu();
        int figura = 0;

        if (opcion == 1 || opcion == 2) {
            System.out.println("Selecciona la figura la cual quieres calcular");
            System.out.println("---------------------------------------------");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            figura = in.nextInt();
            while (figura < 1 || figura > 3) {
                System.out.println("Selecciona una opción correcta");
                figura = in.nextInt();
            }
        }

        switch (opcion) {
            case 1:
                if (figura == 1) {
                    System.out.println("Dime el lado de la figura");
                    base = in.nextInt();
                    resul = squarePerimeter(base);
                    System.out.println("El perímetro del cuadrado es de " + resul);
                } else if (figura == 2) {
                    System.out.println("Dime la base de la figura");
                    base = in.nextInt();
                    System.out.println("Y ahora dime la altura de la figura");
                    altura = in.nextInt();
                    resul = rectanglePerimeter(base, altura);
                    System.out.println("El perímetro del rectángulo es de " + resul);
                } else if (figura == 3) {
                    System.out.println("Dime el radio del círculo");
                    base = in.nextInt();
                    resul = circlePerimeter(base);
                    System.out.println("El perímetro del círculo es de " + resul);
                }
                break;
            case 2:
                if (figura == 1) {
                    System.out.println("Dime el lado de la figura");
                    base = in.nextInt();
                    resul = squareArea(base);
                    System.out.println("El área del cuadrado es de " + resul);
                } else if (figura == 2) {
                    System.out.println("Dime la base de la figura");
                    base = in.nextInt();
                    System.out.println("Y ahora dime la altura de la figura");
                    altura = in.nextInt();
                    resul = rectangleArea(base, altura);
                    System.out.println("El área del rectángulo es de " + resul);
                } else if (figura == 3) {
                    System.out.println("Dime el radio del círculo");
                    base = in.nextInt();
                    resul = circleArea(base);
                    System.out.println("El área del círculo es de " + resul);
                }
                break;
            case 3:
                System.out.println("Dime el número");
                resulint = in.nextInt();
                boolean primo = primeNumber(resulint);
                if (primo) {
                    System.out.println("El número es primo");
                }

                primo = notPrimeNumber(resulint);
                if (primo) {
                    System.out.println("El número NO es primo");
                }
                break;
            case 4:
                System.out.println("Dime el número");
                resulint = in.nextInt();
                resulint = digitNumber(resulint);
                if (resulint == 1) {
                    System.out.println("El número tiene " + resulint + " dígito");
                } else {
                    System.out.println("El número tiene " + resulint + " dígitos");
                }
                break;
            case 5:
                System.out.println("Dime el número");
                resulint = in.nextInt();
                resulint = evenDigits(resulint);
                if (resulint == 1) {
                    System.out.println("El número tiene " + resulint + " dígito par");
                } else {
                    System.out.println("El número tiene " + resulint + " dígitos pares");
                }
                break;
            case 6:
                System.out.println("Dime el número");
                resulint = in.nextInt();
                resulint = oddDigits(resulint);
                if (resulint == 1) {
                    System.out.println("El número tiene " + resulint + " dígito impar");
                } else {
                    System.out.println("El número tiene " + resulint + " dígitos impares");
                }
                break;
            case 7:
                System.out.println("Dime el número del cuál quieres calcular el factorial");
                resulint = in.nextInt();
                if (resulint < 0) {
                    resulint = -resulint;
                } else if (resulint == 0 || resulint == 1) {
                    resulint = 1;
                } else {
                    resulint = factorialNumber(resulint);
                }
                System.out.println("El resultado es: " + resulint);
                break;
            case 8:
                System.out.println("Dime el número del cuál quieres calcular el factorial");
                resulint = in.nextInt();
                if (resulint < 0) {
                    resulint = -resulint;
                } else if (resulint == 0 || resulint == 1) {
                    resulint = 1;
                } else {
                    resulint = recursiveFactorialNumber(resulint);
                }
                System.out.println("El resultado es: " + resulint);
                break;
            case 9:
                System.out.println("Dime el primer coeficiente");
                int a = in.nextInt();
                System.out.println("Dime el segundo coeficiente");
                int b = in.nextInt();
                System.out.println("Dime el tercer coeficiente");
                int c = in.nextInt();
                resulint = equation(a, b, c);

                if (resulint > 0 ) {
                    System.out.println("Tiene dos soluciones reales");
                } else if (resulint == 0) {
                    System.out.println("Tiene una solución real");
                } else {
                    System.out.println("No tiene solución real");
                }
                break;
            case 10:
                System.out.println("Dime el número");
                resulint = in.nextInt();
                resulint = digitCount(resulint);
                System.out.println("El total de los dígitos es " + resulint);
                break;
        }
    }
}
