package Tema3;

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
        System.out.println("8. Producto de dos números de la array");
        System.out.println("9. Invertir el orden del array (Función)");
        System.out.println("10. Invertir el orden del array (Procedimiento)");
    }

    public static void printArray(int[] array) {
        for (int num = 0; num < array.length; num++){
            System.out.println(array[num]);
        }
    }

    public static int maxArray(int[] array) {
        int max = array[0];
            for (int num = 0; num < array.length; num++) {
                if (max < array[num]){
                    max = array[num];
                }
            }
        return max;
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int num = 0; num < array.length; num++) {
            if (min > array[num]){
                min = array[num];
            }
        }
        return min;
    }

    public static int avgArray(int[] array) {
        int total = 0;
        for (int num = 0; num < array.length; num++){
            total = total + array[num];
        }
        return total / array.length;
    }

    public static boolean checkNumber(int[] array, int numero) {
        boolean check = false;
        for (int num = 0; num < array.length; num++) {
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

    public static int prodArray(int num1, int num2) {
        return num1 * num2;
    }

    public static int[] orderInverter(int[] array) {
        int num1 = array[0];
        int num2 = array[0];
        int lenght = array.length-1;

        for (int cont1 = 0; cont1 <= array.length/2; cont1++) {
            num1 = array[cont1];
            num2 = array[lenght];
            array[cont1] = num2;
            array[lenght] = num1;
            lenght--;
        }
        return array;
    }

    public static void procOrderInverter(int[] array) {
        int num1 = 0;
        int num2 = 0;
        int lenght = array.length-1;

        for (int cont1 = 0; cont1 <= array.length/2; cont1++) {
            num1 = array[cont1];
            num2 = array[lenght];
            array[cont1] = num2;
            array[lenght] = num1;
            lenght--;
        }
        for (int cont2 = 0; cont2 < array.length; cont2++) {
            System.out.println(array[cont2]);
        }
    }

    public static boolean capicua(int[] array){
        boolean cap = false;

        return cap;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int resulint = 0;
        int numero = 0;
        showMenu();

        int opcion = in.nextInt();
        while (opcion < 1 || opcion > 11) {
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
                while (resulint < 0 || resulint >= array.length) {
                    System.out.println("Por favor, introduce una opción correcta");
                    resulint = in.nextInt();
                }

                System.out.println("Ahora selecciona el segundo número (0-6)");
                numero = in.nextInt();
                while (numero < 0 || numero >= array.length) {
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

                while (resulint < 0 || resulint >= array.length) {
                    System.out.println("Por favor, introduce una opción correcta");
                    resulint = in.nextInt();
                }

                System.out.println("Ahora selecciona el segundo número (0-6)");
                numero = in.nextInt();
                while (numero < 0 || numero >= array.length) {
                    System.out.println("Por favor, introduce una opción correcta");
                    numero = in.nextInt();
                }

                resulint = restArray(array[resulint], array[numero]);
                System.out.println("El resultado de la resta es: " + resulint);
                break;
            case 8:
                System.out.println("Selecciona el primer número (0-6)");
                printArray(array);
                resulint = in.nextInt();

                while (resulint < 0 || resulint >= array.length) {
                    System.out.println("Por favor, introduce una opción correcta");
                    resulint = in.nextInt();
                }

                System.out.println("Ahora selecciona el segundo número (0-6)");
                numero = in.nextInt();
                while (numero < 0 || numero >= array.length) {
                    System.out.println("Por favor, introduce una opción correcta");
                    numero = in.nextInt();
                }

                resulint = prodArray(array[resulint], array[numero]);
                System.out.println("El resultado de la multiplicación es: " + resulint);
                break;
            case 9:
                array = orderInverter(array);
                for (int cont = 0; cont < array.length; cont++) {
                    System.out.println(array[cont]);
                }
                break;
            case 10:
                procOrderInverter(array);
                break;
            case 11:
                boolean verd = capicua(array);
                if (verd) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
        }
    }
}
