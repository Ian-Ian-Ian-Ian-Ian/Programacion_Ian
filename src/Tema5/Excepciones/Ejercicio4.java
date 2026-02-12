package Tema5.Excepciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int rng = random.nextInt(100) + 1;
        int[] vector = new int[rng];


        for (int i = 0; i < vector.length; i++) {
            rng = random.nextInt(10) + 1;
            vector[i] = rng;
        }

        for (int i : vector) {
            System.out.println(vector[i]);
        }


    }
}
