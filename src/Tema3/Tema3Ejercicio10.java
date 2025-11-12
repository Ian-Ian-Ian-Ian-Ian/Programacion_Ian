package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio10 {

    public static int selectProgram() {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecciona el programa que quieras realizar\n" +
                           "-----------------------------------------------------------\n" +
                           "1. Muestra el signo de un número introducido por el usuario\n" +
                           "2. Indica si el usuario es mayor de edad o no\n" +
                           "3. Calcula el área y perímetro de un círculo\n" +
                           "4. Conversor de euros a dólares y de dólares a euros\n" +
                           "5. Mostrar tabla de multiplicar de un número\n" +
                           "6. Mostrar tablas de multiplicar del 1 al 10\n" +
                           "7. Comprobador de números primos\n" +
                           "8. Comprobador de fechas\n" +
                           "9. Dibujar triángulos");
        int programa = in.nextInt();
        if (programa < 1 && programa > 9) {
            while (programa < 1 && programa > 9) {
                System.out.println("Selecciona un programa disponilble");
                programa = in.nextInt();
            }
        }
        return programa;
    }

    public static void main(String[] args){

        int programa = selectProgram();

        switch (programa) {
            case 1:
                Tema3Ejercicio1.main(null);
                break;
            case 2:
                Tema3Ejercicio2.main(null);
                break;
            case 3:
                Tema3Ejercicio3.main(null);
                break;
            case 4:
                Tema3Ejercicio4.main(null);
                break;
            case 5:
                Tema3Ejercicio5.main(null);
                break;
            case 6:
                Tema3Ejercicio6.main(null);
                break;
            case 7:
                Tema3Ejercicio7.main(null);
                break;
            case 8:
                Tema3Ejercicio8.main(null);
                break;
            case 9:
                Tema3Ejercicio9.main(null);
                break;
        }
    }
}
