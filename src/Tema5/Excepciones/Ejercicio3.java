package Tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] array = new double[5];

        System.out.println("Introduce 5 números");
        for (int i = 0; i < array.length;) {
            try {
                array[i] = in.nextInt();
                System.out.println("Se ha añadido el número a la lista");
                i++;
            } catch (InputMismatchException ex){
                System.err.println("Valor introducido incorrecto, no se ha añadido");
                in.nextInt();
            }
        }

        System.out.println("Lista de números final\n--------------");
        for (double numero : array) {
            System.out.println(numero);
        }
    }
}
