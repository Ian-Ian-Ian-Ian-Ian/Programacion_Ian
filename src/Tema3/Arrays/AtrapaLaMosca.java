package Tema3.Arrays;

import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMosca {

    public static int[] mosca(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length-1; i++) {
            array[i]=0;
        }
        int mosca = random.nextInt(14);
        array[mosca] = 1;
        return array;
    }

    public static boolean hitCheck(int[] array, int golpe) {
        if (array[golpe] == 1) {
            System.out.println("¡Has acertado!");
            return true;
        } else if (golpe == 14) {
            if (array[golpe - 1] == 1) {
            System.out.println("¡Casi! La mosca se ha asustado y ha volado a una nueva posición");
            } else {
                System.out.println("Se escucha un zumbido a lo lejos...");
            }
        } else if (golpe == 0) {
            if (array[golpe + 1] == 1) {
                System.out.println("¡Casi! La mosca se ha asustado y ha volado a una nueva posición");
            } else {
                System.out.println("Se escucha un zumbido a lo lejos...");
            }
        } else if (array[golpe + 1] == 1 || array[golpe - 1] == 1) {
            System.out.println("¡Casi! La mosca se ha asustado y ha volado a una nueva posición");
        } else {
            System.out.println("Se escucha un zumbido a lo lejos...");
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean acierto = false;
        int golpe = 0;

        int[] array;
        array = new int[15];
        array = mosca(array);

        System.out.println("Bienvenido al juego de Atrapa a la mosca");

        while (!acierto) {
            System.out.println("Elige una posicion del 1 al 15");
            golpe = in.nextInt();
            while (golpe < 1 || golpe > 15) {
                System.out.println("He dicho una posición entre el 1 al 15");
                golpe = in.nextInt();
            }
            golpe = golpe - 1;
            acierto = hitCheck(array, golpe);

            if (golpe == 14) {
                if (array[golpe - 1] == 1) {
                    mosca(array);
                }
            } else if (golpe == 0) {
                if (array[golpe + 1] == 1) {
                    mosca(array);
                }
            } else if (array[golpe + 1] == 1 || array[golpe - 1] == 1) {
                mosca(array);
            }
        }
    }
}
