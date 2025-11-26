package Tema3;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class MyArray {
    public static void showMenu() {
        System.out.println("Selecciona la acción que quieras realizar");
        System.out.println("-----------------------------------------");
        System.out.println("1. Printear el array");
        System.out.println("2. El máximo del array");
        System.out.println("3. El mínimo del array");
        System.out.println("4. La media del array");
        System.out.println("5. Comprobar número");
        System.out.println("6. Sumar dos números de la array");
        System.out.println("7. Restar dos número de la array");
    }

    public static void printArray(int[] array) {
        for (int num = 0; num < 7; num++){
            System.out.println(array[num]);
        }
    }

    public static int maxArray(int[] array) {
        int max = array[0];
            for (int num = 0; num < 7; num++) {
                if (max < array[num]){
                    max = array[num];
                }
            }
        return max;
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int num = 0; num < 7; num++) {
            if (min > array[num]){
                min = array[num];
            }
        }
        return min;
    }

    public static int avgArray(int[] array) {
        int total = 0;
        for (int num = 0; num < 7; num++){
            total = total + array[num];
        }
        return total / 7;
    }

    public static boolean checkNumber(int[] array, int numero) {
        boolean check = false;
        for (int num = 0; num < 7; num++) {
            if (array[num] == numero) {
                check = true;
            }
        }
        return check;
    }

    public static int sumArray(int num1, int num2) {
        return num1 + num2;
    }

    public static int restArray(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int resulint = 0;
        int numero = 0;
        showMenu();

        int opcion = in.nextInt();
        while (opcion < 1 || opcion > 7) {
            System.out.println("Dime una opción válida");
            opcion = in.nextInt();
        }

        int[] array;
        array = new int[]{6,375,34,86,934,3,246};

        switch (opcion) {
            case 1:
                printArray(array);
                break;
            case 2:
                resulint = maxArray(array);
                System.out.println("El máximo dentro del array es: " + resulint);
                break;
            case 3:
                resulint = minArray(array);
                System.out.println("El mínimo dentro del array es: " + resulint);
                break;
            case 4:
                resulint = avgArray(array);
                System.out.println("La media del array es: " + resulint);
                break;
            case 5:
                System.out.println("Dime el número que quieres comprobar");
                resulint = in.nextInt();
                boolean check = checkNumber(array, resulint);
                if (check) {
                    System.out.println("El número ESTA en la array");
                } else {
                    System.out.println("El número NO se encuentra en la array");
                }
                break;
            case 6:
                System.out.println("Selecciona el primer número (0-6)");
                printArray(array);
                resulint = in.nextInt();
                while (resulint < 0 || resulint > 6) {
                    System.out.println("Por favor, introduce una opción correcta");
                    resulint = in.nextInt();
                }

                System.out.println("Ahora selecciona el segundo número (0-6)");
                numero = in.nextInt();
                while (numero < 0 || numero > 6) {
                    System.out.println("Por favor, introduce una opción correcta");
                    numero = in.nextInt();
                }

                resulint = sumArray(array[resulint], array[numero]);
                System.out.println("El resultado de la suma es: " + resulint);
                break;
            case 7:
                System.out.println("Selecciona el primer número (0-6)");
                printArray(array);
                resulint = in.nextInt();

                while (resulint < 0 || resulint > 6) {
                    System.out.println("Por favor, introduce una opción correcta");
                    resulint = in.nextInt();
                }

                System.out.println("Ahora selecciona el segundo número (0-6)");
                numero = in.nextInt();
                while (numero < 0 || numero > 6) {
                    System.out.println("Por favor, introduce una opción correcta");
                    numero = in.nextInt();
                }

                resulint = restArray(array[resulint], array[numero]);
                System.out.println("El resultado de la resta es: " + resulint);
                break;
        }
    }
}
