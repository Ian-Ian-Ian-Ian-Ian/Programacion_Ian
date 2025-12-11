package Tema3.Arrays;

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
        System.out.println("11. Comprobar si la array es capicua o no");
        System.out.println("12. Salir");
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

    public static double avgArray(int[] array) {
        double total = 0;
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
                return check;
            }
        }
        return check;
    }

    public static int[] sumArray(int[] array, int[] array2) {
        int[] resultarray;
        resultarray = new int[array.length];
        for (int i = 0; i < resultarray.length; i++) {
            resultarray[i] = array[i] + array2[i];
        }
        return resultarray;
    }

    public static int[] restArray(int[] array, int[] array2) {
        int[] resultarray;
        resultarray = new int[array.length];
        for (int i = 0; i < resultarray.length; i++) {
            resultarray[i] = array[i] - array2[i];
        }
        return resultarray;
    }

    public static int[] prodArray(int[] array, int[] array2) {
        int[] resultarray;
        resultarray = new int[array.length];
        for (int i = 0; i < resultarray.length; i++) {
            resultarray[i] = array[i] * array2[i];
        }
        return resultarray;
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

        array = orderInverter(array);
        for (int cont2 = 0; cont2 < array.length; cont2++) {
            System.out.println(array[cont2]);
        }
    }

    public static boolean capicua(int[] array){
        int lenght = array.length-1;
        boolean cap = true;
        for (int cont = 0; cont <= array.length/2; cont++) {
            if (array[cont] != array[lenght]){
                cap = false;
            }
            lenght--;
        }
        return cap;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int resulint = 0;
        int numero = 0;
        int opcion;
        String a = "";
        String seguir = "si";

        int[] array;
        int[] array2;
        int[] resultarray;

        System.out.println("¿Quieres hacer 1 o 2 arrays?");
        opcion = in.nextInt();
        while (opcion < 1 || opcion > 2) {
            System.out.println("1 o 2");
            opcion = in.nextInt();
        }
        System.out.println("Dime cuantos números quieres que tenga la array (Al menos 3)");
        numero = in.nextInt();
        while (numero < 3) {
            System.out.println("Por favor, que sea al menos 3");
            numero = in.nextInt();
        }
        array = new int[numero];
        array2 = new int[numero];

        System.out.println("Introduce los números de la primera array");

        for (int cont = 0; cont < numero; cont++) {
            resulint = in.nextInt();
            array[cont] = resulint;
        }

        System.out.println("Introduce los números de la segunda array");
        if (opcion == 2) {
            for (int cont = 0; cont < numero; cont++) {
                resulint = in.nextInt();
                array2[cont] = resulint;
            }
        }

        while (seguir == "si") {
            showMenu();

            opcion = in.nextInt();
            while (opcion < 1 || opcion > 12) {
                System.out.println("Dime una opción válida");
                opcion = in.nextInt();
            }

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
                    double resul = avgArray(array);
                    System.out.println("La media del array es: " + resul);
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
                    resultarray = sumArray(array, array2);
                    for (int i = 0; i < resultarray.length; i++) {
                        System.out.println(array[i] + " + " + array2[i] + " = " + resultarray[i]);
                    }
                    break;
                case 7:
                    resultarray = restArray(array, array2);
                    for (int i = 0; i < resultarray.length; i++) {
                        System.out.println(array[i] + " - " + array2[i] + " = " + resultarray[i]);
                    }
                    break;
                case 8:
                    resultarray = prodArray(array, array2);
                    for (int i = 0; i < resultarray.length; i++) {
                        System.out.println(array[i] + " * " + array2[i] + " = " + resultarray[i]);
                    }
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
                    break;
                case 12:
                    seguir = "no";
                    break;
            }
            System.out.println("Inserte cualquier tecla y presiona enter para seguir");
            a = in.next();
        }
    }
}
