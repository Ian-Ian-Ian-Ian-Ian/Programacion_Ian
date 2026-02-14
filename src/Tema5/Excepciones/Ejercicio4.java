package Tema5.Excepciones;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int rng = random.nextInt(100) + 1;
        int[] vector = new int[rng];
        int num = 0;

        for (int i = 0; i < vector.length; i++) {
            rng = random.nextInt(10) + 1;
            vector[i] = rng;
        }

        System.out.println("Dime el número de la casilla del vector que quieras buscar entre 1 y " + vector.length);
        System.out.println("Si quieres acabar, introduce un número negativo");
        while (num >= 0) {
            try {
                num = in.nextInt();

                System.out.println("Número en la casilla " + num + ": " + vector[num - 1]);
            } catch (ArrayIndexOutOfBoundsException ex1) {
                if (!(num < 0)) {
                    System.err.println("No es un número dentro del rango");
                }
            } catch (InputMismatchException ex2) {
                System.err.println("Se ha introducido un dato erróneo, vuelva a intentarlo");
                in.next();
            }
        }

        System.out.println("Se ha terminado el programa con éxito");
    }
}
