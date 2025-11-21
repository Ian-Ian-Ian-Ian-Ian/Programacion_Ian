package Tema3;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

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

    public static boolean primeNumber (int numero) {
        int divisores = 0;
        int dividendo = numero;
        int resultado = 0;
        boolean verdad = false;

        while (dividendo > 0){
            resultado = numero%dividendo;
            if (resultado == 0){
                divisores++;
            }
            dividendo--;
        }

        if (divisores == 1 || divisores == 2) {
            verdad = true;
        }
        return verdad;
    }

    public static boolean notPrimeNumber (int numero) {
        return !primeNumber(numero);
    }

    public static int digitNumber(int numero) {
        int cifra = 0;
        while (numero != 0) {
            numero = numero/10;
            cifra++;
        }
        return cifra;
    }

    public static int evenDigits(int numero){
        int par = 0;
        int cifra = 0;
            while (numero != 0) {
                cifra = numero%2;
                if  (cifra == 0){
                    par++;
                }
                numero = numero/10;
            }
        return par;
    }

    public static int oddDigits(int numero){
        int impar = 0;
        int cifra = 0;
        while (numero != 0) {
            cifra = numero%2;
            if  (cifra == 1){
                impar++;
            }
            numero = numero/10;
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
        return (b*2) - (4 * a * c);
    }

    private static int digitCount(int numero) {
        int total = 0;
            numero = 0;
        return total;
    }

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
                } else if (!primo) {
                    primo = notPrimeNumber(resulint);
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
