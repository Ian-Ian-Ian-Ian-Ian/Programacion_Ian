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
        int opcion = in.nextInt();
        if (opcion < 1 && opcion > 3) {
            while (opcion < 1 && opcion > 3) {
                System.out.println("Selecciona una opción correcta");
                opcion = in.nextInt();
            }
        }
        return opcion;
    }

    public static double squarePerimeter(double lado) {
        double perimetro = lado * 4;
        return perimetro;
    }

    public static double rectanglePerimeter(double base, double altura) {
        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

    public static double circlePerimeter(double radio) {
        double perimetro = 2 * radio * Math.PI;
        return perimetro;
    }

    public static double squareArea(double lado) {
        double area = lado * lado;
        return area;
    }

    public static double rectangleArea(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static double circleArea(double radio) {
        double area = Math.PI * (radio * radio);
        return area;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double perimetro = 0;
        double area = 0;
        double base = 0;
        double altura = 0;
        double resul = 0;

        int opcion = mathMenu();
        int figura = 0;

        if (opcion == 1 || opcion == 2) {
            System.out.println("Selecciona la figura la cual quieres calcular");
            System.out.println("---------------------------------------------");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            figura = in.nextInt();
            if (figura < 1 || figura > 3) {
                while (figura < 1 || figura > 3) {
                    System.out.println("Selecciona una opción correcta");
                    figura = in.nextInt();
                }
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
        }
    }
}
