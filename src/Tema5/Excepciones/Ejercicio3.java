package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] array = new double[5];
        int num = 0;

        System.out.println("Introduce 5 números");
        for (int i = 0; i < array.length;) {
            try {
                num = in.nextInt();
                array[i] = num;
                System.out.println("Se ha añadido el número a la lista");
                i++;
            } catch (InputMismatchException ex){
                System.err.println("Valor introducido incorrecto, no se ha añadido");
            }
            num = 0;
        }

        System.out.println("Lista de números final\n--------------");
        for (double numero : array) {
            System.out.println(numero);
        }
    }
}
